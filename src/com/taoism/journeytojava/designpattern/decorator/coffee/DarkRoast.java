package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:27
 * Author: cf
 * -----------------------------
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        mDescription = "DarkRoast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
