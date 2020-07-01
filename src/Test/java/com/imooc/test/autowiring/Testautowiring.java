package Test.java.com.imooc.test.autowiring;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.autowiring.AutoWiringService;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.autowiring
 * @NAME: Testautowiring
 * @date: 2020/6/30 13:19 周二
 * @author: heqinz
 */
public class Testautowiring extends UnitTestBase {
    public Testautowiring(){
        super("classpath:src\\main\\resources\\spring-autowiring.xml");
    }

    @Test
    public void test001(){

        AutoWiringService service = super.getBean("autoWiringService");
        service.say("this is test!");
    }
}
