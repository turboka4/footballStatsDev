package com.gus.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:/db.properties")
public class RootConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource(env.getProperty("postgres.url"),
                env.getProperty("postgres.username"), env.getProperty("postgres.password"));
        dataSource.setDriverClassName(env.getProperty("postgres.driver"));
        return dataSource;
    }

}
