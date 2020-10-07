package HomeWork1;

import jdk.jfr.Description;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){
        int[] array = {5,6,7,12,-5,32,43,6,12};
        findDuplicatesInArray(array);
    }

    @Description("Write a Java program to find the duplicate values of an array of integer values")
    public static void findDuplicatesInArray(int[] array) {
        int[] resultArray = {};
        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j] && arrayContainsValue(resultArray, array[i])==false)  {
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[resultArray.length - 1] = array[i];
                }
            }
        }
        String result = Arrays.toString(resultArray).replace("[", "").replace("]", "");
        System.out.println(result);
    }

    public static boolean arrayContainsValue(int[] array, int value) {
        boolean result = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                result = true;
                break;
            }
        }
        return result;
    }

}



