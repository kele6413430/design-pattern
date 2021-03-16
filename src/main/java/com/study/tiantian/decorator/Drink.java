package com.study.tiantian.decorator;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/3/16 2:26 下午
 */

public abstract class Drink {

    private String desc;
    private float price = 0.0f;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * 计算费用的抽象方法
     * @return
     */
    public abstract float cost();
}
