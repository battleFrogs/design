package com.gjc.factory.abstract_factory.entity.factory;

import com.gjc.factory.abstract_factory.entity.product.AbstractProduct;
import com.gjc.factory.abstract_factory.entity.product.ProductA;
import com.gjc.factory.abstract_factory.entity.product.ProductB;

public class Factory extends AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ProductA();
    }

    @Override
    public ProductB createProductB() {
        return new ProductB();
    }

    @Override
    public AbstractProduct createProduct(String name) {
        switch (name) {
            case "productA":
                return new ProductA();
            case "productB":
                return new ProductB();
        }
        return null;
    }
}
