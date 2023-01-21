public class Main {
    public static void main(String[] args) {

        Wheater wheater = new Wheater("São Paulo", 28);
        System.out.println(wheater.getCity());
        System.out.println(wheater.calculateCelsius());
        System.out.println(wheater.calculateFahrenheit());
        System.out.println(wheater.calculateKelvin());

    }
}