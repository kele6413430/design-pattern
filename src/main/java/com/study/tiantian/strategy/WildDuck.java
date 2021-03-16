package com.study.tiantian.strategy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:24 下午
 */
public class WildDuck extends Duck{

    public WildDuck() {
        this.flyBehavior = new GoodFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }


}
