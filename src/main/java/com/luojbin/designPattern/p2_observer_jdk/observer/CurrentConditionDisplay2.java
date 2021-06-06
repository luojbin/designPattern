package com.luojbin.designPattern.p2_observer_jdk.observer;

import com.luojbin.designPattern.p2_observer_customize.observer.DisplayElement;
import com.luojbin.designPattern.p2_observer_jdk.subject.WeatherData2;

import java.util.Observable;
import java.util.Observer;


public class CurrentConditionDisplay2 implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData2;

    public CurrentConditionDisplay2(Observable weatherData2) {
        this.weatherData2 = weatherData2;
        weatherData2.addObserver(this);
    }


    @Override
    public void display() {
        System.out.println("CurrentCondition:温度" + temperature + " and 湿度" + humidity);
    }


    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
