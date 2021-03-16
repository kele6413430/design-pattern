package com.study.tiantian.template;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/1/7 5:35 下午
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("制作红豆豆浆");
        RedBeanSoyaMilk milk = new RedBeanSoyaMilk();
        milk.make();


        System.out.println("制作花生豆浆");
        BeanNutSoyaMilk milk2 = new BeanNutSoyaMilk();
        milk2.make();
    }
}
