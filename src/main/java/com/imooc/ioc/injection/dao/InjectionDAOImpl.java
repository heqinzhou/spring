package main.java.com.imooc.ioc.injection.dao;

/**
 * @PACKAGE_NAME: main.java.com.imooc.bean.ioc.injection.dao
 * @NAME: InjectionDAOImpl
 * @date: 2020/6/29 15:46 周一
 * @author: heqinz
 */
public class InjectionDAOImpl implements InjectionDAO{
    public void save(String  arg){
        //模拟数据库保存操作
        System.out.println("保存数据" + arg);
    }
}
