package com.gjc.strategy.entity;

public class Sort implements ISort {


    private ISort sort;

    public Sort(ISort sort) {
        this.sort = sort;
    }

    @Override
    public void sort(int[] arr) {
        sort.sort(arr);
    }

    public void setSort(ISort sort) {
        this.sort = sort;
    }
}
