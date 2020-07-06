package main.java.com.imooc.beanannotation.multibean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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

    @Autowired
    private Map<String,BeanInterface> map;

    private BeanInterface beanInterface;

    @Autowired
    @Qualifier("beanImplTwo")
       public void say(){
//        if(null != list){
//            for(BeanInterface bean : list){
//                System.out.println(bean.getClass().getName());
//            }
//        }else {
//            System.out.println("List<BeanInterface> list is null!!!");
//        }
//
//        System.out.println();
//
//        if(null != map && 0 != map.size()){
//            System.out.println("map....");
//            for(Map.Entry<String,BeanInterface> entry : map.entrySet()){
//                System.out.println(entry.getKey() + "   " + entry.getValue().getClass().getName());
//            }
//        }else {
//            System.out.println("Map<String,BeanInterface> is null...");
//        }
//
//        System.out.println();
//
//        if (null != beanInterface) {
//            System.out.println(beanInterface.getClass().getName());
//        } else {
//            System.out.println("beanInterface is null...");
//        }
   }

}
