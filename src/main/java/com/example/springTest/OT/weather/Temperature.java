package com.example.springTest.OT.weather;

import java.util.List;
import java.util.Optional;

public class Temperature implements Weather{
  private final List<CountryWeatherInfo> countryWeatherInfoList;

  public Temperature(List<CountryWeatherInfo> countryWeatherInfoList) {
    this.countryWeatherInfoList = countryWeatherInfoList;
  }

  @Override
  public int getData(String city) {
    Optional<CountryWeatherInfo> countryDetailFound = countryWeatherInfoList.stream().filter(countryWeatherInfo ->
            countryWeatherInfo.getCity().equals(city)).findFirst();
    if(countryDetailFound.isPresent()){
      return countryDetailFound.get().getTemperature();
    }else{
      throw new RuntimeException("City Not Found");
    }
  }
}
