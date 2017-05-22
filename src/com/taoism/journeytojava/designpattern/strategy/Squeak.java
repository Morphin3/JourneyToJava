package com.taoism.journeytojava.designpattern.strategy;

/**
 * Date: 2017-05-22
 * Time: 14:36
 * Author: cf
 * -----------------------------
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }

}
