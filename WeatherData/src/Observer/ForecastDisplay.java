package Observer;

import Models.WeatherData;
import Observable.WeatherStation;

public class ForecastDisplay implements Observer, DisplayElement {
    private WeatherStation weatherStation;
    private Double humidity;

    public ForecastDisplay(WeatherStation weatherStation) {
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
        if (this.humidity > 50.0) {
            System.out.println("There is a high likelihood of rain in upcoming days");
        } else {
            System.out.println("Chances of rain are not much");
        }
    }

    @Override
    public void update() {
        // We take only those data points that are necessary to us
        this.humidity = weatherStation.getWeatherData().humidity;
        display();
    }
}
