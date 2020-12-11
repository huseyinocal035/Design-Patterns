package BuilderPattern;

public class Car {

    private String engine;
    private String wheel;
    private String body;
    private String sunroof;
    private String rim;

    public Car(Builder builder) {
        this.engine = builder.engine;
        this.wheel = builder.wheel;
        this.body = builder.body;
        this.sunroof = builder.sunroof;
        this.rim = builder.rim;
    }

    public static class Builder {
        private final String engine;
        private final String wheel;
        private final String body;
        private String sunroof;
        private String rim;

        public Builder(String engine, String wheel, String body) {
            this.engine = engine;
            this.wheel = wheel;
            this.body = body;
        }

        public Builder setSunroof(String sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setRim(String rim) {
            this.rim = rim;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car Features and Brands\n" +
            "engine=" + engine + '\n' +
            "wheel=" + wheel + '\n' +
            "body=" + body + '\n' +
            "sunroof=" + sunroof + '\n' +
            "rim=" + rim + '\n';
    }
}
