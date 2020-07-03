package Test.java.com.imooc.test.beanannotation;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.beanannotation.BeanAnnotation;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.beanannotation
 * @NAME: TestBeanAnnotation
 * @date: 2020/7/3 10:47 周五
 * @author: heqinz
 */
public class TestBeanAnnotation extends UnitTestBase {

    public TestBeanAnnotation() {
        super("classpath*:src\\main\\resources\\spring-beanannotation.xml");
    }

    @Test
    public void test01(){
//      BeanAnnotation bean = super.getBean("bean");
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.say("This ia test");
    }

    @Test
    public void test02(){
        BeanAnnotation bean = super.getBean("beanAnnotation");
        bean.myHashCode();

        bean = super.getBean("beanAnnotation");
        bean.myHashCode();

    }
}
