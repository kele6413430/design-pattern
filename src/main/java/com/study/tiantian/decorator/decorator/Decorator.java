package com.study.tiantian.decorator.decorator;

import com.study.tiantian.decorator.Drink;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:52 下午
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //getPrice 自己的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDesc() {
        //输出了被装饰者的信息
        return super.getDesc() + " " + super.getPrice() + " " + drink.getDesc();
    }
}
