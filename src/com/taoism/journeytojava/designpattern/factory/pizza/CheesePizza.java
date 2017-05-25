package com.taoism.journeytojava.designpattern.factory.pizza;

import com.taoism.journeytojava.designpattern.factory.PizzaIngredientFactory;

/**
 * Date: 2017-05-24
 * Time: 17:17
 * Author: cf
 * -----------------------------
 */
public class CheesePizza extends Pizza {

    private PizzaIngredientFactory mIngredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        mIngredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + name);

        dough = mIngredientFactory.createDough();
        sauce = mIngredientFactory.createSauce();
        cheese = mIngredientFactory.createCheese();


    }

}
