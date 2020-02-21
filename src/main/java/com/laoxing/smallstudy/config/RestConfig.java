package com.laoxing.smallstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SmallStudy
 * @description:
 * @author: Feri
 * @create: 2020-02-21 14:49
 */
@Configuration
public class RestConfig {
    @Bean
    public RestTemplate createRT(){
        return new RestTemplate();
    }
}