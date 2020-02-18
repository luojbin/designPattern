package com.luojbin.designPattern.p2_observer.displayElement;

import com.luojbin.designPattern.p2_observer.observer.Observer;
import com.luojbin.designPattern.p2_observer.subject.Subject;

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

    // LUOJBIN 这是我的todo任务
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
