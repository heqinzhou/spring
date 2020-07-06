package main.java.com.imooc.beanannotation.javabased;

/**
 * @PACKAGE_NAME: main.java.com.imooc.beanannotation.javabased
 * @NAME: StringStore
 * @date: 2020/7/6 10:25 周一
 * @author: heqinz
 */
public class StringStore implements Store<String>{

    public void init(){
        System.out.println("This is init!");
    }

    public void destroy(){
        System.out.println("this is destroy");
    }
}
