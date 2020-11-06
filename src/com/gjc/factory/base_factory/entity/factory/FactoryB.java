package com.gjc.factory.base_factory.entity.factory;

import com.gjc.factory.base_factory.entity.product.ProductB;
import com.gjc.factory.base_factory.entity.product.AbstractProduct;

public class FactoryB extends AbstractFactory {

    @Override
    public AbstractProduct createProduct() {
        return new ProductB();
    }

}
