package ObserverPattern;

public class FloatWeatherObserver implements Observer {

    private int pressure;

    private int temperature;

    private int humidity;

    private Subject subject;

    public FloatWeatherObserver(Subject subject) {
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
        System.out.println("Float Weather Observer \n" +
            '{' + " pressure = " + (float) pressure +
            ", temperature = " + (float) temperature +
            ", humidity = " + (float) humidity + " }");
    }
}
