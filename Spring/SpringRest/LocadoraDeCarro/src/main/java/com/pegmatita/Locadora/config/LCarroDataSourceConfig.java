package com.pegmatita.Locadora.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories(basePackages = "com.pegmatita.Locadora.repository.locadoradeCarroRepository",
                        entityManagerFactoryRef = "lCarroEntityManager")
public class LCarroDataSourceConfig {

    @Bean
    @Primary
    public DataSource lCarrodataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/lcd");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean lCarroEntityManager(EntityManagerFactoryBuilder builder,
            @Qualifier("lCarrodataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.pegmatita.Locadora.model.locadoraDeCarroModel")
                .build();
    }

}
