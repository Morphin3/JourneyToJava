package com.taoism.journeytojava.designpattern.Observer.custom;

import java.util.ArrayList;

/**
 * Date: 2017-05-22
 * Time: 15:30
 * Author: cf
 * -----------------------------
 */
public class WeatherData implements Subject {

    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    private ArrayList<Observer> mObservers;

    public WeatherData() {
        mObservers = new ArrayList();
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
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = mObservers.indexOf(observer);
        if (i > 0) {
            mObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < mObservers.size(); i++) {
            Observer observer = mObservers.get(i);
            observer.update(mTemperature, mHumidity, mPressure);
        }
    }


    public void setMeasurements(float temperate, float humidity, float pressure){
        this.mTemperature = temperate;
        this.mHumidity = humidity;
        this.mPressure = pressure;
        measurementsChanged();
    }



}
