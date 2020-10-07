package HomeWork2.Task3;

public class KelvinConverter implements Converter {
    @Override
    public double convert(double degreeC) {
        double degreeK = degreeC + 273.15;
        return degreeK;
    }
}
