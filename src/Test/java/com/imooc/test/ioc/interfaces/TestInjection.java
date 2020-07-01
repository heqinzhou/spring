package Test.java.com.imooc.test.ioc.interfaces;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.ioc.injection.service.InjectionService;
import main.java.com.imooc.ioc.interfaces.OneInterface;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.ioc.interfaces
 * @NAME: TestInjection
 * @date: 2020/6/29 16:10 周一
 * @author: heqinz
 */
public class TestInjection extends UnitTestBase {

    public TestInjection() {
        super("classpath*:src\\main\\resources\\spring-injection.xml");
    }


    @Test
    public void testConn(){
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据");
    }
}
