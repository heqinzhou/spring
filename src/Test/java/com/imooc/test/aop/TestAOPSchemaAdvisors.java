package Test.java.com.imooc.test.aop;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.aop.schema.advice.biz.AspectBiz;
import main.java.com.imooc.aop.schema.advisors.service.InvokeService;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.aop
 * @NAME: TestAOPSchemaAdvisors
 * @date: 2020/7/7 13:53 周二
 * @author: heqinz
 */
public class TestAOPSchemaAdvisors extends UnitTestBase {

    public TestAOPSchemaAdvisors(){
        super("classpath:src\\main\\resources\\spring-aop-schema-advisors.xml");
    }

    @Test
    public void testSave() {
        InvokeService service = super.getBean("invokeService");
        service.invoke();

        System.out.println();
        service.invokeException();
    }
}
