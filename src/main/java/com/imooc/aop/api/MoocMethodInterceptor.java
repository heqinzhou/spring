package main.java.com.imooc.aop.api;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api
 * @NAME: MoocMethodInterceptor
 * @date: 2020/7/7 15:38 周二
 * @author: heqinz
 */
public class MoocMethodInterceptor implements MethodInterceptor {


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MoocMethodInterceptor 1 : " + invocation.getMethod().getName() + "     " +
                invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MoocMethodInterceptor 2 : " + obj);
        return obj;
    }
}
