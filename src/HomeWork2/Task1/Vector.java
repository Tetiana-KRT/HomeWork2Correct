package HomeWork2.Task1;

import jdk.jfr.Description;

import java.util.Arrays;

import static java.lang.Math.pow;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector (double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Description("Count vector length")
    public static double vectorLength(Vector vector) {
        double length = Math.sqrt(pow(vector.getX(),2) + pow(vector.getY(),2) + pow(vector.getZ(),2));
        return length;
    }

    @Description("Count scalar product")
    public static double scalarProduct(Vector vector1, Vector vector2) {
        double scalarProduct = vector1.getX()*vector2.getX() + vector1.getY()*vector2.getY() +
                vector1.getZ()*vector2.getZ();
        return scalarProduct;
    }
    @Description("Generate N vectors")
    public static Vector[] nVectors(int N) {
        Vector[] resultArray= {};
        resultArray = Arrays.copyOf(resultArray, N);
        for (int i=0; i<N; i++){
            double x = getRandomDouble();
            double y = getRandomDouble();
            double z = getRandomDouble();
            Vector iVector = new Vector(x, y, z);
            resultArray[i] = iVector;
        }
        return resultArray;
    }
    public static int getRandomNumberInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static double getRandomDouble() {
        int intPart = getRandomNumberInRange(0, 999999);
        double result = Math.random() * intPart;
        return result;
    }
    public static String showVector(Vector vector) {
        String coordinates = "(" + vector.getX() + ", " + vector.getY() + ", " + vector.getZ() + ")";
        return coordinates;
    }
    public static String showVectors(Vector[] vectors) {
        String result = "";
        for (int i=0; i<vectors.length; i++){
            result = result + i + " vector = " + showVector(vectors[i]) + ";" + System.lineSeparator();
        }
        return result;
    }
}
