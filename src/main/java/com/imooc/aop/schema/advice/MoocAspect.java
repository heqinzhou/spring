package main.java.com.imooc.aop.schema.advice;

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
}
