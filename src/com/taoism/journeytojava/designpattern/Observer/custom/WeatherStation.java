package com.taoism.journeytojava.designpattern.Observer.custom;

/**
 * Date: 2017-05-22
 * Time: 17:47
 * Author: cf
 * -----------------------------
 */
public class WeatherStation {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);


        weatherData.setMeasurements(80, 65, 30.4f);

    }
}
