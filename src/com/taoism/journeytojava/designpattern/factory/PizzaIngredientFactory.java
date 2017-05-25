package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.Ingredient.Cheese;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Clams;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Dough;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Pepperoni;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Sauce;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Veggies;

/**
 * Date: 2017-05-24
 * Time: 19:48
 * Author: cf
 * -----------------------------
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
