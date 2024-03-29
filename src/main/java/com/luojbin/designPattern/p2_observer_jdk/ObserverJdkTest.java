package com.luojbin.designPattern.p2_observer_jdk;

import com.luojbin.designPattern.p2_observer_jdk.observer.CurrentConditionDisplay2;
import com.luojbin.designPattern.p2_observer_jdk.observer.ForecastDisplay2;
import com.luojbin.designPattern.p2_observer_jdk.observer.StatisticsDisplay2;
import com.luojbin.designPattern.p2_observer_jdk.subject.WeatherData2;

import java.util.Observer;

class ObserverJdkTest {
    public static void main(String[] args){
        WeatherData2 weatherData2 = new WeatherData2();

        Observer conditionDisplay = new CurrentConditionDisplay2(weatherData2);
        Observer forecastDisplay2 = new ForecastDisplay2(weatherData2);
        Observer statisticsDisplay2 = new StatisticsDisplay2(weatherData2);

        weatherData2.setMeasurements(80f,60f,30.3f);
        weatherData2.setMeasurements(60f,70f,30.5f);
        weatherData2.setMeasurements(84f,52f,31.3f);


    }
}
