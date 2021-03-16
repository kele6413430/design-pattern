package com.study.tiantian.decorator.coffe;

import com.study.tiantian.decorator.Drink;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:47 下午
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
