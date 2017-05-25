package com.taoism.journeytojava.designpattern.factory;

/**
 * Date: 2017-05-24
 * Time: 17:54
 * Author: cf
 * -----------------------------
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        NYStylePizzaStroe nyStylePizzaStroe = new NYStylePizzaStroe();
        nyStylePizzaStroe.orderPizza("cheese");
    }

}
