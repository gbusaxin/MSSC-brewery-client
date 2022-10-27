package com.example.msscbreweryclient.web.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @created : by GBu on 27. 10. 2022, štvrtok
 * @mailto : grigorii.busakhin@software-foundation.sk
 **/
@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplateBuilder restTemplateBuilder(){
        return new RestTemplateBuilder();
    }
}
