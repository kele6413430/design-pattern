package com.study.tiantian.decorator.decorator;

import com.study.tiantian.decorator.Drink;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:57 下午
 */
public class Soy extends Decorator{

    public Soy(Drink drink) {
        super(drink);
        setDesc("豆浆");
        setPrice(1.0f);
    }
}
