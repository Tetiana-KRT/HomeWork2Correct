package HomeWork2.Task3;

public class FahrenheitConverter implements Converter {
    @Override
    public double convert(double degreeC) {
        double degreeF = degreeC * 1.8 + 32;
        return degreeF;
    }
}
