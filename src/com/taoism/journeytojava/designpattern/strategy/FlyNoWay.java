package com.taoism.journeytojava.designpattern.strategy;


/**
 * Date: 2017-05-22
 * Time: 11:42
 * Author: cf
 * -----------------------------
 */

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
