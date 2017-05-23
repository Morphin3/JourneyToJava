package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:27
 * Author: cf
 * -----------------------------
 */
public class Soy extends CondimentDecorator {

    private Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }


    @Override
    public String getDescription() {
        return mBeverage.getDescription() +", Soy";
    }

    @Override
    public double cost() {
        return .15 + mBeverage.cost();
    }

}
