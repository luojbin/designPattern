package com.luojbin.designPattern.p2_observer_jdk.observer;

import com.luojbin.designPattern.p2_observer_customize.observer.DisplayElement;
import com.luojbin.designPattern.p2_observer_jdk.subject.WeatherData2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay2 implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public ForecastDisplay2(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("这里是天气预报，今天是个好日子");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            display();
        }
    }
}
