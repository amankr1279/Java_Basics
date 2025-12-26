package Observer;

import Models.WeatherData;
import Observable.WeatherStation;

public class HeatIndexDisplay implements Observer, DisplayElement{
    private WeatherStation weatherStation;
    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        weatherStation.registerObserver(this);
    }

    @Override
    public void display() {
        Double T = this.weatherData.temperature;
        Double RH = this.weatherData.humidity;
        Double heatIndex = 0.0;
        heatIndex = -8.783 + 1.611 * T + 2.339 * RH - 0.146 * T * RH
                - 0.012 * T * T - 0.016 * RH * RH
                + 2.212 * T * T * RH * 0.001
                + 7.2546 * 0.0001 * T * RH * RH
                - 3.582 * T * T * RH * RH * 0.000001;

        System.out.printf("Heat index : %.2f\n", heatIndex);
    }

    @Override
    public void update() {
        this.weatherData = this.weatherStation.getWeatherData();
        display();
    }
}
