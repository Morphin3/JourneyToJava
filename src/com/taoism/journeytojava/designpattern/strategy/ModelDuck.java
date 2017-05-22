package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 15:14
 * Author: cf
 * -----------------------------
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}

