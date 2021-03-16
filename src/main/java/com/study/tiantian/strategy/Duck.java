package com.study.tiantian.strategy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:22 下午
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    public Duck() {
    }

    public abstract void display();

    public void fly() {
        if (null != flyBehavior) {
            flyBehavior.fly();
        }
    }
}
