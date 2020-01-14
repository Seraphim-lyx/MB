package com.mybatis.mybatis.service;

import com.mybatis.mybatis.annotation.LogAndWarn;
import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;
import org.springframework.aop.support.StaticMethodMatcherPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class TestAdviser extends AbstractPointcutAdvisor {
    private static final long serialVersionUID = 1L;
    @Autowired
    private TestInterceptor testInterceptor;

    private final StaticMethodMatcherPointcut pointcut = new StaticMethodMatcherPointcut() {
        @Override
        public boolean matches(Method method, Class<?> targetClass) {
            return method.isAnnotationPresent(LogAndWarn.class) || targetClass.isAnnotationPresent(LogAndWarn.class);
        }
    };

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public Advice getAdvice() {
        return this.testInterceptor;
    }
}
