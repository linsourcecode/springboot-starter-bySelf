package com.example.auto;

import com.example.db.DbConfig;
import com.example.service.DbService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置自动注入
@Configuration
@EnableConfigurationProperties(DbConfig.class)
public class DbBean {
    @ConditionalOnMissingBean(DbService.class)
    @Bean
    public DbService dbService(){
        DbService dbService=new DbService();
        return  dbService;
    }



}
