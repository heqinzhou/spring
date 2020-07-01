package Test.java.com.imooc.test.lifecycle;

import Test.java.com.imooc.test.base.UnitTestBase;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.lifecycle
 * @NAME: TestBeanLifecycle
 * @date: 2020/6/30 9:29 周二
 * @author: heqinz
 */
public class TestBeanLifecycle extends UnitTestBase {

    public TestBeanLifecycle(){
        super("classpath:src\\main\\resources\\spring-lifecycle.xml");
    }

    @Test
    public void test01(){
        super.getBean("beanLifeCycle");
    }
}
