package com.luojbin.designPattern.p2_observer.displayElement;

import com.luojbin.designPattern.p2_observer.observer.Observer;
import com.luojbin.designPattern.p2_observer.subject.Subject;

public class StatisticsDisplay implements DisplayElement, Observer{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registObserver(this);
    }


    @Override
    public void display() {
        System.out.println("这里是天气汇总，我也不知道公式是什么，随便写点吧");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
