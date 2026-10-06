package com.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.time.Clock;

@Configuration
@ComponentScan(basePackages = "com.*")
public class AppConfig {
    static{
        System.out.println("AppConfig loads...");
    }
//    static{
//        System.out.println("AppConfig loads...");
//    }

    @Bean
    public Clock configureClock()
    {
        return Clock.systemUTC();
    }

    @Bean
    public DataSource getDataSource()
    {
        HikariConfig config = new HikariConfig();

        config.setJdbcUrl("jdbc:mysql://localhost:3306/fsd_hex_sept_2026");
        config.setUsername("root");
        config.setPassword("Suba@2011");
        config.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return new HikariDataSource(config);
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource)
    {
        return new JdbcTemplate(dataSource);
    }




}