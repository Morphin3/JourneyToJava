package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:21
 * Author: cf
 * -----------------------------
 */
public class Mocha extends CondimentDecorator {

    private Beverage mBeverage;


    public Mocha(Beverage beverage) {
        this.mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + mBeverage.cost();
    }
}
