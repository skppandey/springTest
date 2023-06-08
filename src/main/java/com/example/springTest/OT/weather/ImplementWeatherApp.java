package com.example.springTest.OT.weather;

import java.util.Arrays;
import java.util.List;

public class ImplementWeatherApp {
  public static void main(String[] args) {
    List<CountryWeatherInfo> countryWeatherInfoList = Arrays.asList(
            new CountryWeatherInfo("India","Bangalore", 123456,23),
            new CountryWeatherInfo("India","Chennai", 3434234,35),
            new CountryWeatherInfo("India","Pune", 123456,30),
            new CountryWeatherInfo("India","Delhi", 11236,45)
    );

    Weather w = new Temperature(countryWeatherInfoList);
    int temperature = w.getData("Bangalore");
    System.out.println(temperature);

  }
}
