package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 15:15
 * Author: cf
 * -----------------------------
 */
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Fly With Rocket");
    }

    
}
