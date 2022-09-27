package com.prctisedemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    @ConditionalOnProperty(name="com.prctisedemo.ProdConfig",havingValue="true")
    public ProdConfig getProdConfig(){
        return new ProdConfig();
    }
    @Bean
    @ConditionalOnMissingBean(ProdConfig.class)
    public DevConfig getDevConfig(){
        return new DevConfig();
    }

}
