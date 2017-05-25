package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.pizza.Pizza;

/**
 * Date: 2017-05-24
 * Time: 17:40
 * Author: cf
 * -----------------------------
 */
public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        return null;
    }

}
