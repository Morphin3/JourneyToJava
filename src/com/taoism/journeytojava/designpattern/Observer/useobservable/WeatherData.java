package com.taoism.journeytojava.designpattern.Observer.useobservable;

import java.util.Observable;

/**
 * Date: 2017-05-22
 * Time: 15:30
 * Author: cf
 * -----------------------------
 */
public class WeatherData extends Observable {

    private float mTemperature;
    private float mHumidity;
    private float mPressure;


    public WeatherData() {

    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public float getPressure() {
        return mPressure;
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }


    public void setMeasurements(float temperate, float humidity, float pressure) {
        this.mTemperature = temperate;
        this.mHumidity = humidity;
        this.mPressure = pressure;
        measurementsChanged();
    }



}
