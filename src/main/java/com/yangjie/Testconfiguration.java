package com.yangjie;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Testconfiguration {

    @Bean
    public TestService testService() {
        return new TestService();
    }
}
