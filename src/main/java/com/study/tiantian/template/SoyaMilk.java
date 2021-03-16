package com.study.tiantian.template;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2021/1/7 5:29 下午
 */
public abstract class SoyaMilk {

    final void make(){
        select();
        addCondiments();
        soak();
        beat();
    }

    void select(){
        System.out.println("第一步:选择好的新鲜黄豆");
    }

    abstract void addCondiments();

    void soak(){
        System.out.println("第三步:黄豆和配料开始浸泡:需要三个小时");
    }

    void beat(){
        System.out.println("第四步:黄豆和配料放到豆浆机去打碎");
    }
}
