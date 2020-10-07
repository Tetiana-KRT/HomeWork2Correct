package HomeWork1;

import jdk.jfr.Description;

public class Task4 {
    public static void main(String[] args){
        int[] array = {5,6,7,12,-5,32,43};
        sumOfArrayValues(array);
    }

    @Description("Write a Java program to sum values of an array")
    public static void sumOfArrayValues(int[] array) {
        int valueSum = 0;
        for (int i=0; i < array.length; i++) {
            valueSum = valueSum + array[i];
        }
        System.out.println(valueSum);
    }
}



