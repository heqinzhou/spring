package main.java.com.imooc.ioc.interfaces;

public class OneInterfaceImpl implements  OneInterface{

    @Override
    public String hello(String word) {
        return "word from interface \"OneInterface\":" + word;
    }

}

