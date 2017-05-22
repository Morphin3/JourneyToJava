package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 14:38
 * Author: cf
 * -----------------------------
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
