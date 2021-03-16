package com.study.tiantian.strategy;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:31 下午
 */
public class Client {

    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();

        wildDuck.fly();

        ToyDuck toyDuck = new ToyDuck();
        toyDuck.fly();

        PekingDuck pekingDuck = new PekingDuck();

        pekingDuck.fly();
        pekingDuck.flyBehavior = new NoFlyBehavior();
        pekingDuck.fly();
    }
}
