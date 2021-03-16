package com.study.tiantian.proxy.cglib;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 5:55 下午
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory factory = new ProxyFactory(teacherDao);

        TeacherDao proxyInstance = (TeacherDao) factory.getProxyInstance();
        proxyInstance.teach();
    }
}
