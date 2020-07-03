package main.java.com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @PACKAGE_NAME: main.java.com.imooc.beanannotation.multibean
 * @NAME: BeanInvoker
 * @date: 2020/7/3 14:07 周五
 * @author: heqinz
 */

@Component
public class BeanInvoker {

    @Autowired
    private List<BeanInterface> list;

    public void say(){
        if(null != list){
            for(BeanInterface bean : list){
                System.out.println(bean.getClass().getName());
            }
        }else {
            System.out.println("List<BeanInterface> list is null!!!");
        }
    }

}
