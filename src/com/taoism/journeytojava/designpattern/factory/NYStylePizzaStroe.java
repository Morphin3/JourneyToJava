package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.pizza.CheesePizza;
import com.taoism.journeytojava.designpattern.factory.pizza.NYStyleClamPizza;
import com.taoism.journeytojava.designpattern.factory.pizza.NYStylePepperoniPizza;
import com.taoism.journeytojava.designpattern.factory.pizza.NYStyleViggiePizza;
import com.taoism.journeytojava.designpattern.factory.pizza.Pizza;

/**
 * Date: 2017-05-24
 * Time: 17:36
 * Author: cf
 * -----------------------------
 */
public class NYStylePizzaStroe extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza  = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("Viggie")) {
            return new NYStyleViggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("Pepperoni")) {
            return new NYStylePepperoniPizza();
        }

        return pizza;

    }

}
