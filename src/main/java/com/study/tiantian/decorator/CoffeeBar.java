package com.study.tiantian.decorator;

import com.study.tiantian.decorator.coffe.Decaf;
import com.study.tiantian.decorator.coffe.LongBlack;
import com.study.tiantian.decorator.decorator.Chocolate;
import com.study.tiantian.decorator.decorator.Decorator;
import com.study.tiantian.decorator.decorator.Milk;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 3:01 下午
 */
public class CoffeeBar {
    public static void main(String[] args) {
        Drink order = new LongBlack();

        Decorator milk = new Milk(order);
        Decorator chocolate = new Chocolate(milk);
        Decorator chocolate1 = new Chocolate(chocolate);

        System.out.println(chocolate1.getDesc() + chocolate1.cost());

        Drink order2 = new Decaf();
        Decorator milk1 = new Milk(order2);

        System.out.println(milk1.getDesc() + milk1.cost());
    }
}
