package main.java.com.imooc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * @PACKAGE_NAME: main.java.com.imooc.resource
 * @NAME: MoocResource
 * @date: 2020/6/30 14:15 周二
 * @author: heqinz
 */
public class MoocResource implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }
    public void resource() throws IOException {
        Resource resource = applicationContext.getResource("main\\resources\\config.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
