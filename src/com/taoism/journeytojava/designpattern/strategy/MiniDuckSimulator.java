package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 14:33
 * Author: cf
 * -----------------------------
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();


    }
}
