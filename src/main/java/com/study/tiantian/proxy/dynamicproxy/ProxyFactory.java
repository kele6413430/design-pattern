package com.study.tiantian.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 4:09 下午
 */
public class ProxyFactory<T> {

    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    public T getProxyInstance() {

        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("jdk proxy is started");
                        return method.invoke(target, args);
                    }
                });
    }
}
