package com.gjc.strategy.entity;

public class InsertSort implements ISort {

    @Override
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentNumber = arr[i];
            int j = i - 1;
            while (j >= 0 && currentNumber < arr[j]) {
                arr[j + 1] = arr[i];
                j--;
            }

            arr[j + 1] = currentNumber;
        }
    }
}
