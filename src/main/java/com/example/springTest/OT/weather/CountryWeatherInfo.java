package com.example.springTest.OT.weather;

public class CountryWeatherInfo {
  private String country;
  private String city;
  private int pinCode;

  private int temperature;

  public CountryWeatherInfo(String country, String city, int pinCode, int temperature) {
    this.country = country;
    this.city = city;
    this.pinCode = pinCode;
    this.temperature = temperature;
  }

  public String getCountry() {
    return country;
  }

  public String getCity() {
    return city;
  }

  public int getPinCode() {
    return pinCode;
  }

  public int getTemperature() {
    return temperature;
  }
}
