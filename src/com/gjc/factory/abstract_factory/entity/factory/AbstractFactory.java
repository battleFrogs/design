package com.gjc.factory.abstract_factory.entity.factory;

import com.gjc.factory.abstract_factory.entity.product.AbstractProduct;
import com.gjc.factory.abstract_factory.entity.product.ProductA;
import com.gjc.factory.abstract_factory.entity.product.ProductB;

public abstract class AbstractFactory {

    public abstract ProductA createProductA();

    public abstract ProductB createProductB();

    public abstract AbstractProduct createProduct(String name);

}
