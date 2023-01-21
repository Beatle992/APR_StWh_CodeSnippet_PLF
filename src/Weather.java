public abstract class Wheather {

    private String city;
    private double temperature;

    public Wheather(String city, double temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public String getCity() {
        return this.city;
    }

    public double getTemperature() {
        return this.temperature;
    }

    public abstract double calculateCelsius();
    public abstract double calculateFahrenheit();
    public abstract double calculateKelvin();

}
