package com.taoism.journeytojava.designpattern.Observer.custom;

/**
 * Date: 2017-05-22
 * Time: 16:03
 * Author: cf
 * -----------------------------
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private WeatherData mWeatherData;
    private float       mTemperate;
    private float       mHumidity;


    public CurrentConditionDisplay(WeatherData weatherData) {
        this.mWeatherData = weatherData;
        mWeatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + mTemperate + "F degrees and " + mHumidity + "% humidity");
    }

    @Override
    public void update(float temperate, float humidity, float pressure) {
        mTemperate = temperate;
        mHumidity = humidity;
        display();
    }
}
