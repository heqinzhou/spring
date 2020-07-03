package Test.java.com.imooc.test.beanannotation;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.beanannotation.injection.service.InjectionService;
import main.java.com.imooc.beanannotation.multibean.BeanInvoker;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.beanannotation
 * @NAME: TestInjection
 * @date: 2020/7/3 13:42 周五
 * @author: heqinz
 */
public class TestInjection extends UnitTestBase {
    public TestInjection() {
        super("classpath:src\\main\\resources\\spring-beanannotation.xml");
    }

    @Test
    public void testAutowired() {
        InjectionService service = super.getBean("injectionServiceImpl");
        service.save("This is autowired.");
    }

    @Test
    public void testmultibean(){
        BeanInvoker invoker = super.getBean("beanInvoker");
        invoker.say();
    }

}
