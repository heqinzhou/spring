package main.java.com.imooc.aop.api;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api
 * @NAME: BizLogicImpl
 * @date: 2020/7/7 14:26 周二
 * @author: heqinz
 */
public class BizLogicImpl implements BizLogic{
    @Override
    public String save() {
        System.out.println("BizLogicImpl: BizLogicImpl save");
        return "BizLogicImpl save.";
    }
}
