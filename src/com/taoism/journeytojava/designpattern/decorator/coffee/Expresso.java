package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:19
 * Author: cf
 * -----------------------------
 * 浓咖啡
 */
public class Expresso extends Beverage {


    public Expresso() {
        mDescription = "Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
