package com.gjc.factory.abstract_factory;

import com.gjc.factory.abstract_factory.entity.factory.AbstractFactory;
import com.gjc.factory.abstract_factory.entity.factory.Factory;


/**
 * 通过定义抽象工厂类 ，实现不同商品的创建
 *
 * 不用再根据具体的商品去创建具体的工厂类
 *  只是使用共同的一个工厂实现类
 *
 *
 */
public class Test {


    public static void main(String[] args) {

        AbstractFactory factory = new Factory();
        factory.createProductA().show();
        factory.createProductB().show();
        factory.createProduct("productA").show();
        factory.createProduct("productB").show();


    }


}
