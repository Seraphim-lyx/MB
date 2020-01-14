package com.mybatis.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAdapter {
    @Bean
    public TestAdapter tAdapter(){
        return new TestAdapter();
    }

}
