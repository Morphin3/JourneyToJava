package com.taoism.journeytojava.designpattern.Observer.custom;

/**
 * Date: 2017-05-22
 * Time: 15:34
 * Author: cf
 * -----------------------------
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
