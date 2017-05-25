package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.pizza.Pizza;

/**
 * Date: 2017-05-24
 * Time: 17:14
 * Author: cf
 * -----------------------------
 */
public abstract class PizzaStore {

    Pizza mPizza;

    public Pizza orderPizza(String type) {

        mPizza = createPizza(type);

//        mPizza.prepare();
        mPizza.bake();
        mPizza.cut();
        mPizza.box();

        return mPizza;
    }

    protected abstract Pizza createPizza(String type);

}
