package com.pegmatita.LocadoraDeCarro.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import com.pegmatita.LocadoraDeCarro.repository.mariadb.CamisaRepository;

@Configuration
@EnableJpaRepositories(basePackageClasses = CamisaRepository.class, 
                        entityManagerFactoryRef = "mariaDbEntityManager")
public class MariaDbDataSourceConfig {

    @Bean
    public DataSource mariaDbDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3307/maria");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean mariaDbEntityManager(EntityManagerFactoryBuilder builder,
            @Qualifier("mariaDbDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.pegmatita.LocadoraDeCarro.model.mariadb")
                .build();
    }

}
