package com.gjc.build;

public class Test {

    public static void main(String[] args) {


        MilkTea milkTea = new MilkTea.Builder().type("原味").ice(true).size("大杯").build();

        System.out.println(milkTea);

    }

}
