package Models;

public class WeatherData {
    public Double temperature;
    public Double humidity;
    public Double pressure;

    public WeatherData(Double temperature, Double humidity, Double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "WeatherData" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure;
    }
}
