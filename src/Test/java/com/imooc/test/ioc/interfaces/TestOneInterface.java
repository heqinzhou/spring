package Test.java.com.imooc.test.ioc.interfaces;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.ioc.interfaces
 * @NAME: TestOneInterface
 * @date: 2020/6/29 14:32 周一
 * @author: heqinz
 */
import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.ioc.interfaces.OneInterface;
import org.junit.Test;

public class TestOneInterface extends UnitTestBase {

    public TestOneInterface() {
        super("classpath*:src\\main\\resources\\spring-ioc.xml");
    }
    @Test
    public void testHello(){
        OneInterface oneInterfaces = super.getBean("oneInterface");
        System.out.println(oneInterfaces.hello("我的输入参数"));
    }
}
