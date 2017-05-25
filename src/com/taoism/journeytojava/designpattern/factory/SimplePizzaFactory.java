package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.pizza.CheesePizza;
import com.taoism.journeytojava.designpattern.factory.pizza.ClamPizza;
import com.taoism.journeytojava.designpattern.factory.pizza.PepperonPizza;
import com.taoism.journeytojava.designpattern.factory.pizza.Pizza;
import com.taoism.journeytojava.designpattern.factory.pizza.ViggiePizza;

/**
 * Date: 2017-05-24
 * Time: 17:12
 * Author: cf
 * -----------------------------
 */
public class SimplePizzaFactory {

    public Pizza creaePizza(String type) {

        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("Viggie")) {
            pizza = new ViggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("Pepperon")) {
            pizza = new PepperonPizza();
        }

        return pizza;
    }
}
