package com.pegmatita.Locadora.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "com.pegmatita.Locadora.repository.locadoraDeRoupaRepository",
    entityManagerFactoryRef = "lRoupaEntityManager",
    transactionManagerRef = "lRoupaTransactionManager"
)
public class LRoupaDataSourceConfig {

    @Bean(name = "lRoupaDataSource")
    public DataSource lRoupaDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.mariadb.jdbc.Driver");
        dataSource.setUrl("jdbc:mariadb://localhost:3307/maria");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }

    @Bean(name = "lRoupaEntityManager")
    public LocalContainerEntityManagerFactoryBean lRoupaEntityManager(EntityManagerFactoryBuilder builder,
            @Qualifier("lRoupaDataSource") DataSource dataSource) {
        return builder
                .dataSource(dataSource)
                .packages("com.pegmatita.Locadora.model.locadoraDeRoupaModel")
                .persistenceUnit("lRoupa")
                .build();
    }

    @Bean(name = "lRoupaTransactionManager")
    public PlatformTransactionManager lRoupaTransactionManager(
            @Qualifier("lRoupaEntityManager") LocalContainerEntityManagerFactoryBean lRoupaEntityManager) {
        return new JpaTransactionManager(lRoupaEntityManager.getObject());
    }
}
