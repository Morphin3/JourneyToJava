
package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 11:14
 * Author: cf
 * -----------------------------
 */

public abstract class Duck {

    FlyBehavior   mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void performFly() {
        mFlyBehavior.fly();
    }

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, even decoys");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        mQuackBehavior = quackBehavior;
    }
}
