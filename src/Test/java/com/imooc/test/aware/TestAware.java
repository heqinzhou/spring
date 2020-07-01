package Test.java.com.imooc.test.aware;

import Test.java.com.imooc.test.base.UnitTestBase;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.aware
 * @NAME: TestAware
 * @date: 2020/6/30 9:52 周二
 * @author: heqinz
 */
public class TestAware  extends UnitTestBase {
    public TestAware(){
        super("classpath:src\\main\\resources\\spring-aware.xml");
    }

    @Test
    public void testMoocApplicationContext(){
       System.out.println("testMoocApplicationContext : " + super.getBean("moocApplicationContext").hashCode());
	}

    @Test
    public void textMoocBeanName() {
        System.out.println("textMoocBeanName : " + super.getBean("moocBeanName").hashCode());
    }
}

