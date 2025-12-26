import Models.WeatherData;
import Observable.WeatherStation;
import Observer.CurrentConditionsDisplay;
import Observer.ForecastDisplay;
import Observer.HeatIndexDisplay;

public class Main {
    public static void main(String[] args) {
        System.out.println("Weather data: Observer Pattern");
        WeatherStation weatherStation = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherStation);
        new ForecastDisplay(weatherStation);
        new HeatIndexDisplay(weatherStation);

        weatherStation.setWeatherData(new WeatherData(32.0, 70.1, 1.015));
        weatherStation.setWeatherData(new WeatherData(33.0, 40.2, 1.015));

        System.out.println("Removing current conditions display");
        weatherStation.removeObserver(currentConditionsDisplay);

        weatherStation.setWeatherData(new WeatherData(36.0, 75.1, 1.015));


    }
}