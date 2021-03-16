package com.study.tiantian.proxy.dynamicproxy;

import static java.lang.System.out;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 4:21 下午
 */
public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();

        ITeacherDao proxyInstance = new ProxyFactory<ITeacherDao>(teacherDao).getProxyInstance();
        proxyInstance.teach();
        out.println(proxyInstance.getClass());

        proxyInstance.sayHello("tiantian");
    }
}
