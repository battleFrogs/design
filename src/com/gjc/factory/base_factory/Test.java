package com.gjc.factory.base_factory;

import com.gjc.factory.base_factory.entity.factory.AbstractFactory;
import com.gjc.factory.base_factory.entity.factory.FactoryA;
import com.gjc.factory.base_factory.entity.factory.FactoryB;
import com.gjc.factory.base_factory.entity.product.AbstractProduct;


/**
 * 使用定义 抽象工厂 ，抽象商品 ，
 * 定义不用的实现具体的要的工厂  和  具体要的实现 商品 去做
 */
public class Test {


    public static void main(String[] args) {

        AbstractFactory factoryA = new FactoryA();
        AbstractProduct productA = factoryA.createProduct();
        productA.show();

        AbstractFactory factoryB = new FactoryB();
        AbstractProduct productB = factoryB.createProduct();
        productB.show();


    }



}
