package com.luojbin.designPattern.p2_observer_customize.displayElement;

import com.luojbin.designPattern.p2_observer_customize.observer.Observer;
import com.luojbin.designPattern.p2_observer_customize.subject.Subject;

public class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }


    @Override
    public void display() {
        System.out.println("这里是天气汇总，我也不知道公式是什么，随便写点吧");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
