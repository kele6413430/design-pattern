package com.study.tiantian.strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <p></p>
 *
 * @author yuantiantian
 * @date 2020/12/23 3:44 下午
 */
public class Strategy {

    public static void main(String[] args) {
        Integer[] data = {9, 1, 2, 8, 4, 3};

        Comparator<Integer> comparator = (o1, o2) -> {
            if (o1 > o2) {
                return -1;
            } else if (o1 < o2){
                return 1;
            }else {
                return 0;
            }
        };

        Arrays.sort(data, comparator);

        System.out.println(Arrays.toString(data));
    }
}
