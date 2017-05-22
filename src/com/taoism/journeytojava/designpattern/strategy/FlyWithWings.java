package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 11:42
 * Author: cf
 * -----------------------------
 */

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly With Wings");
    }

}
