package com.study.tiantian.proxy.staticproxy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/22 3:03 下午
 */
public class TeacherDao implements ITeacherDao{
    public void teach() {
        System.out.println("i am teaching");
    }
}
