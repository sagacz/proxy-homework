package com.proxy.homework.weather;

public class WeatherProxy implements WeatherRetreiver{

    private WeatherRetreiver weather;

    @Override
    public String getWeather() throws InterruptedException{
        if(weather == null)
            weather = new WeatherForecast();
        return weather.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if(weather == null)
            weather = new WeatherForecast();
        weather.refreshData();
    }
}
