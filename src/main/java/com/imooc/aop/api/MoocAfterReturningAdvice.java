package main.java.com.imooc.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;
/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api
 * @NAME: MoocAfterReturningAdvice
 * @date: 2020/7/7 15:36 周二
 * @author: heqinz
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice : " + method.getName() + "     " +
                target.getClass().getName() + "       " + returnValue);
    }
}
