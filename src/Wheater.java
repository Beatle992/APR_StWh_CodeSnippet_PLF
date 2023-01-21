public class Wheater {

    private final String city;
    private final double temperature;

    public Wheater(String city, double temperature) {
        this.city = city;
        this.temperature = temperature;
    }

    public double calculateCelsius() {
        return this.temperature;
    }

    public double calculateFahrenheit() {
        return temperature * 1.8 + 32;
    }

    public double calculateKelvin() {
        return temperature + 273.15;
    }

    public String getCity() {
        return switch (city) {
            case "São Paulo" -> "São Paulo";
            case "Rio de Janeiro" -> "Rio de Janeiro";
            case "Vitória" -> "Vitória";
            default -> "City not found";
        };
    }
}
