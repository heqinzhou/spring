package main.java.com.imooc.aop.schema.advice;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.schema.advice
 * @NAME: FitImpl
 * @date: 2020/7/6 16:23 周一
 * @author: heqinz
 */
public class FitImpl implements Fit{
    @Override
    public void filter() {
        System.out.println("FitImpl filter..");
    }
}
