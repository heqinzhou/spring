package Test.java.com.imooc.test.aop;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.aop.api.BizLogic;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.aop
 * @NAME: TestAOPAPI
 * @date: 2020/7/7 14:35 周二
 * @author: heqinz
 */
public class TestAOPAPI extends UnitTestBase {

    public TestAOPAPI() {
        super("src\\main\\resources\\classpath:spring-aop-api.xml");
    }

    @Test
    public void testSave() {
        BizLogic logic = (BizLogic)super.getBean("bizLogicImpl");
        logic.save();
    }

}
