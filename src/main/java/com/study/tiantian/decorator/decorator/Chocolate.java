package com.study.tiantian.decorator.decorator;

import com.study.tiantian.decorator.Drink;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:57 下午
 */
public class Chocolate extends Decorator{

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("巧克力");
        setPrice(3.0f);
    }
}
