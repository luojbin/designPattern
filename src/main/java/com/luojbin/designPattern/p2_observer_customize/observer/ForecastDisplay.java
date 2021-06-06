package com.luojbin.designPattern.p2_observer_customize.observer;

import com.luojbin.designPattern.p2_observer_customize.subject.Subject;

public class ForecastDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void display() {
        System.out.println("这里是天气预报，今天是个好日子");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
