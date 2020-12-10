package ObserverPattern;

public class IntegerWeatherObserver implements Observer {

    private int pressure;

    private int temperature;

    private int humidity;

    private Subject subject;

    public IntegerWeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;

        demonstrateData();
    }

    private void demonstrateData() {
        System.out.println("Integer Weather Observer \n" +
            '{' + " pressure = " + pressure +
            ", temperature = " + temperature +
            ", humidity = " + humidity + " }");
    }
}
