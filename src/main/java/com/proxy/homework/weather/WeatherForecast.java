package com.proxy.homework.weather;

import java.util.Random;

public class WeatherForecast implements WeatherRetreiver{

    public enum Condition  {
        SUNNY, CLOUDY, RAINY, SNOWING
    }

    private double temperature;
    private double humidity;
    private Condition condition;

    public WeatherForecast() throws InterruptedException{
        refreshData();
    }

    @Override
    public String getWeather() {
        return "Weather:\n" + "temp.: " + temperature + " humidity: " + humidity + " condition: " + condition;
    }

    @Override
    public void refreshData() throws InterruptedException{
        Thread.sleep(5000);
        temperature = new Random().nextDouble(50);
        humidity = new Random().nextDouble(100);
        condition = Condition.values()[new Random().nextInt(3)];
    }


}
