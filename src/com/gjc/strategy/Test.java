package com.gjc.strategy;

import com.gjc.strategy.entity.BubbleSort;
import com.gjc.strategy.entity.Sort;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 1, 2, 3, 5, 4};
        Sort sort = new Sort(new BubbleSort());

        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
