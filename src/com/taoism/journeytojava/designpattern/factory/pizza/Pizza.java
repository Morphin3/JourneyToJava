package com.taoism.journeytojava.designpattern.factory.pizza;

import com.taoism.journeytojava.designpattern.factory.Ingredient.Cheese;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Clams;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Dough;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Pepperoni;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Sauce;
import com.taoism.journeytojava.designpattern.factory.Ingredient.Veggies;

/**
 * Date: 2017-05-24
 * Time: 17:15
 * Author: cf
 * -----------------------------
 */
public abstract class Pizza {

    protected String    name;
    protected Dough     dough;
    protected Sauce     sauce;
    protected Veggies   veggies[];
    protected Cheese    cheese;
    protected Pepperoni pepperoni;
    protected Clams     clam;

    protected abstract void prepare();

//    public void prepare() {
//
//        System.out.println("preparing " + name);
//        System.out.println("Tossing " + dough);
//        System.out.println("Adding sauce " + sauce);
//        System.out.println("Adding toppings");
//
//        for (int i = 0; i < toppings.size(); i++) {
//            System.out.println("  " + toppings.get(i));
//        }
//
//    }

    public void bake() {
        System.out.println("bake");
    }

    public void cut() {
        System.out.println("cut");
    }

    public void box() {
        System.out.println("box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
