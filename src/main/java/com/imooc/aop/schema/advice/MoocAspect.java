package main.java.com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.schema.advice
 * @NAME: MoocAspect
 * @date: 2020/7/6 16:23 周一
 * @author: heqinz
 */
public class MoocAspect {
    public void before() {
        System.out.println("MoocAspect before...");
    }

    public void afterReturning(){
        System.out.println("MoocAspect afterReturning...");
    }

    public void afterThrowing(){
        System.out.println("MoocAspect afterThrowing...");
    }

    public void after(){
        System.out.println("MoocAspect after...");
    }

    public Object around(ProceedingJoinPoint pjp){
        Object object = null;
        try {
            System.out.println("MoocAspect after 111");
            object = pjp.proceed();
            System.out.println("MoocAspect after 222");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }

    public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
        System.out.println(bizName + "" + times);
        Object object = null;
        try {
            System.out.println("MoocAspect after 111");
            object = pjp.proceed();
            System.out.println("MoocAspect after 222");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }
}
