package com.luojbin.designPattern.p2_observer2.displayElement;

import com.luojbin.designPattern.p2_observer.displayElement.DisplayElement;
import com.luojbin.designPattern.p2_observer2.subject.WeatherData2;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay2 implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable weatherData;

    public StatisticsDisplay2(Observable weatherData) {
        //<editor-fold desc="测试idea自定义折叠代码块">
        this.weatherData = weatherData;
        weatherData.addObserver(this);
        //</editor-fold>
    }


    @Override
    public void display() {
        System.out.println("这里是天气汇总，我也不知道公式是什么，随便写点吧");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) obs;
            display();
        }
    }
}
