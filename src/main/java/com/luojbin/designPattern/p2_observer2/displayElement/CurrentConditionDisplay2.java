package com.luojbin.designPattern.p2_observer2.displayElement;

import com.luojbin.designPattern.p2_observer.displayElement.DisplayElement;
import com.luojbin.designPattern.p2_observer2.subject.WeatherData2;

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


    public void display() {
        System.out.println("CurrentCondition:温度" + temperature + " and 湿度" + humidity);
    }


    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            this.temperature = weatherData2.getTemperature();
            this.humidity = weatherData2.getHumidity();
            display();
        }
    }
}
