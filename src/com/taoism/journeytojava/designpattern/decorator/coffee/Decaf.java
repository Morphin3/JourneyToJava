package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:28
 * Author: cf
 * -----------------------------
 * 低咖啡因
 */
public class Decaf extends Beverage {

    public Decaf() {
        mDescription = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
