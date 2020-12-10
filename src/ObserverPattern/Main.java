package ObserverPattern;

public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setPressure(120);
        weatherStation.setTemperature(80);
        weatherStation.setHumidity(30);
    }
}
