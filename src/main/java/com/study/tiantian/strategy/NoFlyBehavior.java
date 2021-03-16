package com.study.tiantian.strategy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:19 下午
 */
public class NoFlyBehavior implements FlyBehavior{
    public void fly() {
        System.out.println("不会飞翔");
    }
}
