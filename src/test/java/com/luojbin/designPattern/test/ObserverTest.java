package com.luojbin.designPattern.test;

import com.luojbin.designPattern.observer.displayElement.CurrentConditionDisplay;
import com.luojbin.designPattern.observer.subject.WeatherData;

public class ObserverTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);


        weatherData.setMeasurements(80,60,30.3f);
        weatherData.setMeasurements(60,70,30.5f);
        weatherData.setMeasurements(84,52,31.3f);
    }
}
