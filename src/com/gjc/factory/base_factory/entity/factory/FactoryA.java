package com.gjc.factory.base_factory.entity.factory;

import com.gjc.factory.base_factory.entity.product.ProductA;
import com.gjc.factory.base_factory.entity.product.AbstractProduct;

public class FactoryA extends AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ProductA();
    }
}
