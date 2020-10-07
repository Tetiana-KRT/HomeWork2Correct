package HomeWork2.Task3;

public class Task3 {
    public static void main(String[] args){
        double celsiusDegree = 36.6;
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        KelvinConverter kelvinConverter = new KelvinConverter();
        double convertCelsiusToFahrenheit = fahrenheitConverter.convert(celsiusDegree);
        double convertCelsiusToKelvin = kelvinConverter.convert(celsiusDegree);

        System.out.println(celsiusDegree + " C = " + convertCelsiusToFahrenheit + " F");
        System.out.println(celsiusDegree + " C = " + convertCelsiusToKelvin + " K");
    }
}
