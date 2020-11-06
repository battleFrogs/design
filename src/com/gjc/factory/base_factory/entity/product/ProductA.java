package com.gjc.factory.base_factory.entity.product;

import com.gjc.factory.base_factory.entity.product.AbstractProduct;

public class ProductA extends AbstractProduct {


    @Override
    public void show() {
        System.out.println("商品A");
    }
}
