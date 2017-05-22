package com.taoism.journeytojava.designpattern.Observer.useobservable;


import com.taoism.journeytojava.designpattern.Observer.custom.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Date: 2017-05-22
 * Time: 16:03
 * Author: cf
 * -----------------------------
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    WeatherData mWeatherData;
    private float mTemperate;
    private float mHumidity;


    public CurrentConditionDisplay(WeatherData weatherData) {
        this.mWeatherData = weatherData;
        mWeatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + mTemperate + "F degrees and " + mHumidity + "% humidity(use observable)");
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) o;
        mTemperate = weatherData.getTemperature();
        mHumidity = weatherData.getHumidity();
        display();
    }

}
