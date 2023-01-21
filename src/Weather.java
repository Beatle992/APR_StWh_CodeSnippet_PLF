public abstract class Weather {

    private double temperature;

    public Weather( double temperature) {

        this.temperature = temperature;
    }

    public double getTemperature() {
        return this.temperature;
    }

}
