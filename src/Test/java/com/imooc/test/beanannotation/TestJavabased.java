package Test.java.com.imooc.test.beanannotation;

import Test.java.com.imooc.test.base.UnitTestBase;
import main.java.com.imooc.beanannotation.javabased.MyDriverManager;
import main.java.com.imooc.beanannotation.javabased.Store;
import main.java.com.imooc.beanannotation.javabased.StringStore;
import org.junit.Test;

/**
 * @PACKAGE_NAME: Test.java.com.imooc.test.beanannotation
 * @NAME: TestJavabased
 * @date: 2020/7/6 10:27 周一
 * @author: heqinz
 */
public class TestJavabased  extends UnitTestBase {

    public TestJavabased(){
        super("classpath*:src\\main\\resources\\spring-beanannotation.xml");
    }

    @Test
    public void test01(){
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void test02(){
        MyDriverManager manager = super.getBean("myDriverManager");
        System.out.println(manager.getClass().getName());
    }

    @Test
    public void test03(){
        Store store = super.getBean("stringStore");
        System.out.println(store.hashCode());

        store = super.getBean("stringStore");
        System.out.println(store.hashCode());
    }

}
