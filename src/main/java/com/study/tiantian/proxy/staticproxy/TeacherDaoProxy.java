package com.study.tiantian.proxy.staticproxy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 3:03 下午
 */
public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    public void teach() {
        System.out.println("start to proxy");
        target.teach();
        System.out.println("proxy is ended");
    }
}
