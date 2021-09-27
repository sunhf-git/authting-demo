package com.sunhf.jcasbin;

import org.casbin.annotation.CasbinDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
public class JcasbinLanucher {


    @Bean
    @CasbinDataSource
    public DataSource casbinDataSource() {
        return DataSourceBuilder.create().url("jdbc:postgresql://10.0.104.66:5432/jcasbin").driverClassName("org.postgresql.Driver").username("postgres").password("123456").build();
    }

    public static void main(String[] args) {
        SpringApplication.run(JcasbinLanucher.class, args);
    }
}
