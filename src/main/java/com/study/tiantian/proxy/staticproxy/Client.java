package com.study.tiantian.proxy.staticproxy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 3:03 下午
 */
public class Client {

    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
        teacherDaoProxy.teach();
    }
}
