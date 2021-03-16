package com.study.tiantian.strategy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:24 下午
 */
public class PekingDuck extends Duck{

    public PekingDuck() {
        this.flyBehavior = new BadFlyBehavior();
    }

    @Override
    public void display() {
        System.out.println("野鸭");
    }


}
