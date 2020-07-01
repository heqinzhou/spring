package main.java.com.imooc.ioc.injection.service;

import main.java.com.imooc.ioc.injection.dao.InjectionDAO;
import main.java.com.imooc.ioc.injection.dao.InjectionDAOImpl;

/**
 * @PACKAGE_NAME: main.java.com.imooc.bean.ioc.injection.service
 * @NAME: InjectionServiceImpl
 * @date: 2020/6/29 15:47 周一
 * @author: heqinz
 */
public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;
    //设值注入
    public void setInjectionDAO(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO1) {
        this.injectionDAO = injectionDAO1;
    }

    public void save(String arg) {
        //模拟业务操作
        System.out.println("Service接收参数：" + arg);
        arg = arg + ":" + this.hashCode();
        injectionDAO.save(arg);
    }
}
