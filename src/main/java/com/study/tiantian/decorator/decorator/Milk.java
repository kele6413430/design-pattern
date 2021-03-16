package com.study.tiantian.decorator.decorator;

import com.study.tiantian.decorator.Drink;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:57 下午
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        setDesc("牛奶");
        setPrice(2.0f);
    }
}
