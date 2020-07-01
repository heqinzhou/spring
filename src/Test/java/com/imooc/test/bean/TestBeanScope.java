package Test.java.com.imooc.test.bean;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.bean.BeanScope;
import main.java.com.imooc.ioc.injection.service.InjectionService;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.bean
 * @NAME: TestBeanScope
 * @date: 2020/6/29 16:57 周一
 * @author: heqinz
 */
public class TestBeanScope extends UnitTestBase {

    public TestBeanScope() {
        super("classpath*:src\\main\\resources\\spring-beanscope.xml");
    }

    @Test
    public void testSay() {
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope2 = super.getBean("beanScope");
        beanScope2.say();
    }

    @Test
    public void testSay2() {
        BeanScope beanScope  = super.getBean("beanScope");
        beanScope.say();
    }
}
