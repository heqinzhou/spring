package main.java.com.imooc.aop.schema.advisors;

import org.aspectj.lang.ProceedingJoinPoint;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.core.Ordered;
import org.springframework.dao.PessimisticLockingFailureException;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.schema.adisors.Service
 * @NAME: ConcurrentOperationExecutor
 * @date: 2020/7/7 13:52 周二
 * @author: heqinz
 */
public class ConcurrentOperationExecutor implements Ordered {

    private static final int DFFAULT_MAX_RETRIES = 2;
    private int maxRetries = DFFAULT_MAX_RETRIES;
    private int order = 1;

    public void setMaxRetries(int maxRetries) {
        this.maxRetries = maxRetries;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getOrder() {
        return this.order;
    }

    public Object doConcurrentOperation(ProceedingJoinPoint pjp) throws Throwable {
        int numAttempts = 0;
        PessimisticLockingFailureException lockingFailureException;

        do{
            numAttempts++;
            System.out.println("Try times:" + numAttempts);
            try {
                return pjp.proceed();
            } catch (PessimisticLockingFailureException ex) {
                lockingFailureException = ex;
            }
        }while (numAttempts <= this.maxRetries);
        System.out.println("Try error:" + numAttempts);
        throw lockingFailureException;
    }
}
