package main.java.com.imooc.aop.api;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api
 * @NAME: MoocThrowsAdvice
 * @date: 2020/7/7 15:39 周二
 * @author: heqinz
 */
public class MoocThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) throws Throwable {
        System.out.println("MoocThrowsAdvice afterThrowing 1");
    }

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) throws Throwable {
        System.out.println("MoocThrowsAdvice afterThrowing 2 : " + method.getName() + "       " +
                target.getClass().getName());
    }

}
