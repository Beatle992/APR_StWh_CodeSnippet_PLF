public class CalculateKelvin extends Weather {
    public CalculateKelvin( double temperature) {
        super( temperature);
    }

    public double calculateFahrenheit() {
        return (getTemperature() - 32) / 1.8;
    }
    public double calculateKelvin() {
        return (getTemperature() - 32) / 1.8 + 273.15;
    }

    public String getCity() {
        return " New York's temperature: "+ getTemperature() +  " Degree Celsius " + calculateKelvin() + " Kelvin" + " and " + calculateFahrenheit() + " Fahrenheit";
    }
}