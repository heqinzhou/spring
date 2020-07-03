package main.java.com.imooc.beanannotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @PACKAGE_NAME: main.java.com.imooc.beanannotation
 * @NAME: BeanAnnotation
 * @date: 2020/7/3 10:47 周五
 * @author: heqinz
 */

//@Component("bean")
@Component
@Scope
public class BeanAnnotation {
    public void say(String arg){
        System.out.println("BeanAnnotation:" + arg);
    }

    public void myHashCode() {
        System.out.println("BeanAnnotation:" + this.hashCode());
    }
}
