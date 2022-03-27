package com.proxy.homework.weather;

public interface WeatherRetreiver {
    String getWeather() throws InterruptedException;
    void refreshData() throws InterruptedException;
}
