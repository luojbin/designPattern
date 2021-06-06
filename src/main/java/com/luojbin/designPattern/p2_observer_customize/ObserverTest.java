package com.luojbin.designPattern.p2_observer_customize;

import com.luojbin.designPattern.p2_observer_customize.displayElement.CurrentConditionDisplay;
import com.luojbin.designPattern.p2_observer_customize.displayElement.DisplayElement;
import com.luojbin.designPattern.p2_observer_customize.displayElement.ForecastDisplay;
import com.luojbin.designPattern.p2_observer_customize.displayElement.StatisticsDisplay;
import com.luojbin.designPattern.p2_observer_customize.subject.WeatherData;

class ObserverTest {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();

        DisplayElement conditionDisplay = new CurrentConditionDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);
        DisplayElement statisticDisplay = new StatisticsDisplay(weatherData);


        weatherData.setMeasurements(80,60,30.3f);
        weatherData.setMeasurements(60,70,30.5f);
        weatherData.setMeasurements(84,52,31.3f);


    }
}
