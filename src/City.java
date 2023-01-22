public abstract class City {
    private double temperature;

    public City(double temperature) {
        this.temperature = temperature;
    }

    protected double getTemperature() {
        return this.temperature;
    }
}