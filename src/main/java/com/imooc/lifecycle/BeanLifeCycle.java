package main.java.com.imooc.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @PACKAGE_NAME: main.java.com.imooc.lifecycle
 * @NAME: BeanLifeCycle
 * @date: 2020/6/30 9:28 周二
 * @author: heqinz
 */
public class BeanLifeCycle implements InitializingBean, DisposableBean {

    public void defautInit() {
        System.out.println("Bean defautInit.");
    }

    public void defaultDestroy() {
        System.out.println("Bean defaultDestroy.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("bean destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean afterPropertiesSet");
    }

    public void start(){
        System.out.println("Bean stsrt.");
    }

    public void stop(){
        System.out.println("Bean stop.");
    }
}

