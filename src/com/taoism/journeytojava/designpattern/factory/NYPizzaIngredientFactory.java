package com.taoism.journeytojava.designpattern.factory;

import com.taoism.journeytojava.designpattern.factory.Ingredient.Cheese;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Clams;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Dough;
import com.taoism.journeytojava.designpattern.factory.Ingredient.MarinaraSauce;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Pepperoni;
import com.taoism.journeytojava.designpattern.factory.Ingredient.ReggianoCheese;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Sauce;
import com.taoism.journeytojava.designpattern.factory.Ingredient.ThinCrustDough;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Veggies;

/**
 * Date: 2017-05-24
 * Time: 19:57
 * Author: cf
 * -----------------------------
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    @Override
    public Pepperoni createPepperoni() {
        return null;
    }

    @Override
    public Clams createClam() {
        return null;
    }
}
