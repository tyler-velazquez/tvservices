package com.tylervelazquez.customer;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CutomerConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();

    }
}
