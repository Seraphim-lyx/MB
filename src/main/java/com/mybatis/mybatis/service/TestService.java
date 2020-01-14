package com.mybatis.mybatis.service;

import com.mybatis.mybatis.annotation.LogAndWarn;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @LogAndWarn
    public void test(){
        System.out.println("test");
    }
}
