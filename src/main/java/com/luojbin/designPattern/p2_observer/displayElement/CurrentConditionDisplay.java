package com.luojbin.designPattern.p2_observer.displayElement;

import com.luojbin.designPattern.p2_observer.observer.Observer;
import com.luojbin.designPattern.p2_observer.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private final Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition:温度" + temperature + " and 湿度" + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
