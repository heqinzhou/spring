package main.java.com.imooc.beanannotation.injection.service;

import main.java.com.imooc.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: main.java.com.imooc.bean.ioc.injection.service
 * @NAME: InjectionServiceImpl
 * @date: 2020/6/29 15:47 周一
 * @author: heqinz
 */

@Service
public class InjectionServiceImpl implements InjectionService {
    //@Autowired
    private InjectionDAO injectionDAO;

    //@Autowired
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    @Autowired
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }
    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
