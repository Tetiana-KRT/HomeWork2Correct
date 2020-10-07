package HomeWork2.Task1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args){
        Vector[] generateVectors = Vector.nVectors(2);
        String vectorsCoordinates = Vector.showVectors(generateVectors);
        double vectorLength = Vector.vectorLength(generateVectors[0]);
        double scalarProduct = Vector.scalarProduct(generateVectors[0], generateVectors[1]);

        System.out.println("Generated vectors are: " + System.lineSeparator() + vectorsCoordinates);
        System.out.println("Vector length is " + vectorLength);
        System.out.println("Scalar product is " + scalarProduct);

    }
}
