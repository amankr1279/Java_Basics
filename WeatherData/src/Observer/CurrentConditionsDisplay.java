package Observer;

import Models.WeatherData;
import Observable.WeatherStation;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    public WeatherStation getWeatherStation() {
        return weatherStation;
    }

    public void setWeatherStation(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" +
                "Temperature is "+ weatherData.temperature + " and " +
                "Humidity is " + weatherData.humidity + "%");
    }

    @Override
    public void update() {
        this.weatherData = weatherStation.getWeatherData();
        display();
    }
}
