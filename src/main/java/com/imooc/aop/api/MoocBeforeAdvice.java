package main.java.com.imooc.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api
 * @NAME: MoocBeforeAdvice
 * @date: 2020/7/7 14:34 周二
 * @author: heqinz
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice : " + method.getName() + "     " +
                target.getClass().getName());
    }
}
