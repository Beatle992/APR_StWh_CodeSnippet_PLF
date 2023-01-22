public abstract class Weather {
    private double temperature;

    public Weather( double temperature) {
        this.temperature = temperature;
    }

    protected double getTemperature() {
        return this.temperature;
    }
}