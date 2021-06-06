package com.luojbin.designPattern.p2_observer_customize;

import com.luojbin.designPattern.p2_observer_customize.observer.CurrentConditionDisplay;
import com.luojbin.designPattern.p2_observer_customize.observer.DisplayElement;
import com.luojbin.designPattern.p2_observer_customize.observer.ForecastDisplay;
import com.luojbin.designPattern.p2_observer_customize.observer.StatisticsDisplay;
import com.luojbin.designPattern.p2_observer_customize.subject.WeatherData;

import java.util.Date;

class ObserverCustomizeTest {
    public static void main(String[] args) throws InterruptedException {
        WeatherData weatherData = new WeatherData();

        DisplayElement conditionDisplay = new CurrentConditionDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);
        DisplayElement statisticDisplay = new StatisticsDisplay(weatherData);
        System.out.println("气象站与布告板已建立...");

        gap(3);
        weatherData.setMeasurements(80,60,30.3f);
        gap(3);
        weatherData.setMeasurements(60,70,30.5f);
        gap(5);
        weatherData.setMeasurements(84,52,31.3f);
    }

    private static void gap(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000L);
        System.out.println("\n===========");
        System.out.println("现在的时间是: " + new Date());
    }
}
