package main.java.com.imooc.aop.schema.advisors.service;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.schema.adisors.Service
 * @NAME: InvokeService
 * @date: 2020/7/7 13:52 周二
 * @author: heqinz
 */
@Service
public class InvokeService {
    public void invoke() {
        System.out.println("InvokeService ......");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("");
    }
}
