package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:20
 * Author: cf
 * -----------------------------
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        mDescription = "HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }

}
