package Test.java.com.imooc.test.resource;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.resource.MoocResource;
import org.junit.Test;

import java.io.IOException;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.resource
 * @NAME: TestMoocResource
 * @date: 2020/6/30 14:15 周二
 * @author: heqinz
 */
public class TestMoocResource extends UnitTestBase {

    public TestMoocResource() {
        super("classpath:src\\main\\resources\\spring-resource.xml");
    }

    @Test
    public void testResource() {
        MoocResource resource = super.getBean("moocResource");
        try {
            resource.resource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
