package com.taoism.journeytojava.designpattern.decorator.coffee;

/**
 * Date: 2017-05-23
 * Time: 10:16
 * Author: cf
 * -----------------------------
 */
public abstract class Beverage {
    String mDescription = "Unknown Beverage";


    public String getDescription(){
        return mDescription;
    }

    public abstract double cost();

}
