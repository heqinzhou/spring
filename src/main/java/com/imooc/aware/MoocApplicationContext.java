package main.java.com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aware
 * @NAME: MoocApplicationContext
 * @date: 2020/6/30 9:52 周二
 * @author: heqinz
 */

public class MoocApplicationContext  implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        System.out.println("MoocApplicationContext : " + applicationContext.getBean("moocApplicationContext").hashCode());
    }


}