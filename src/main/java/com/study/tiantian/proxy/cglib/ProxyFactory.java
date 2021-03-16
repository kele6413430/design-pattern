package com.study.tiantian.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 5:41 下午
 */
public class ProxyFactory implements MethodInterceptor  {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);

        return enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("cglib 代理模式开始");
        Object returnValue = method.invoke(target, objects);
        System.out.println("cglib 代理模式结束");
        return returnValue;
    }
}
