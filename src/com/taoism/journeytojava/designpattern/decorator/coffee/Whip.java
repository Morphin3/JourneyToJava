package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:35
 * Author: cf
 * -----------------------------
 */
public class Whip extends CondimentDecorator {

    private Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + mBeverage.cost();
    }
}
