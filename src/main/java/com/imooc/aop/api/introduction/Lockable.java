package main.java.com.imooc.aop.api.introduction;

/**
 * @PACKAGE_NAME: main.java.com.imooc.aop.api.introduction
 * @NAME: Lockable
 * @date: 2020/7/7 15:40 周二
 * @author: heqinz
 */
public interface Lockable {
    void lock();

    void unlock();

    boolean locked();
}
