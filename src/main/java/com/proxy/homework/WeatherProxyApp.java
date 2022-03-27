package com.proxy.homework;

import com.proxy.homework.weather.WeatherForecast;
import com.proxy.homework.weather.WeatherProxy;
import com.proxy.homework.weather.WeatherRetreiver;

import java.util.Random;

public class WeatherProxyApp {

    public static void main(String[] args) throws InterruptedException {

        long begin = System.currentTimeMillis();
        WeatherRetreiver weather = new WeatherProxy();
        for(int i = 0; i < 5; i++){
            int number = new Random().nextInt(10);
            if(number < 3) {
                weather.refreshData();
                System.out.println("DATA REFRESHED:");
            }
            System.out.println("#" + i + " " + weather.getWeather());
        }
        long end = System.currentTimeMillis();
        System.out.println("The execution  took: " + (end - begin) + " [ms]");

    }
}
