package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        FloatWeatherObserver floatWeatherObserver = new FloatWeatherObserver(weatherStation);
        IntegerWeatherObserver integerWeatherObserver = new IntegerWeatherObserver(weatherStation);

        weatherStation.setPressure(120);
        weatherStation.setTemperature(80);
        weatherStation.setHumidity(30);
    }
}
