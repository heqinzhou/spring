package Test.java.com.imooc.test.aop;

import Test.java.com.imooc.test.base.UnitTestBase;
import Test.java.com.imooc.test.beanannotation.TestJavabased;
import main.java.com.imooc.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.aop
 * @NAME: TestAOPSchemaAdvice
 * @date: 2020/7/6 16:32 周一
 * @author: heqinz
 */
public class TestAOPSchemaAdvice extends UnitTestBase {

    public TestAOPSchemaAdvice(){
        super("classpath:src\\main\\resources\\spring-aop-schema-advice.xml");
    }
    @Test
    public void testBiz() {
        AspectBiz biz = super.getBean("aspectBiz");
        biz.biz();
    }
}
