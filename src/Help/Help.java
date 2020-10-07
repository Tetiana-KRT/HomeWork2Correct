package Help;

import jdk.jfr.Description;

import java.util.Arrays;

public class Help {
    public static void main(String[] args){
        int[] array = {5,6,7,12,-5,32,43,6,12,6};
//        findDuplicatesInArraySimple(array);
        findDuplicatesInArrayNew(array);
    }

    @Description("Write a Java program to find the duplicate values of an array of integer values")
    public static void findDuplicatesInArraySimple(int[] array) {
        int[] resultArray = {};
        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[resultArray.length - 1] = array[i];
                }
            }
        }
        String result = Arrays.toString(resultArray).replace("[", "").replace("]", "");
        System.out.println(result);
    }
    public static void findDuplicatesInArrayComplex(int[] array) {
        int[] resultArray = {};
        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    for (int k=0; k < resultArray.length; k++) {
                        if (resultArray.length==0){
                            System.out.println("catch0");
                            resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                            resultArray[resultArray.length - 1] = array[i];
                        }
                        else if (array[i] != resultArray[k]) {
                            System.out.println("catch");
                            resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                            resultArray[resultArray.length - 1] = array[i];
                        }
                    }
                }
            }
        }
        String result = Arrays.toString(resultArray).replace("[", "").replace("]", "");
        System.out.println(result);
    }
    public static void findDuplicatesInArrayCorrect(int[] array) {
        int[] resultArray = {};
        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    resultArray = Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[resultArray.length - 1] = array[i];
                }
            }
        }

        int [] uniqueResultArray = new int[1];
        uniqueResultArray[0] = resultArray[0];
        for (int k=1; k < resultArray.length; k++){
            for (int l = 0; l < k; l++) {
                if (resultArray[k] != resultArray[l]){}



                uniqueResultArray = Arrays.copyOf(uniqueResultArray,
                        uniqueResultArray.length + 1);
                uniqueResultArray[uniqueResultArray.length - 1] = resultArray[k];
            }
        }
        String uniqueResult = Arrays.toString(uniqueResultArray).replace("[", "").
                replace("]", "");
        System.out.println(uniqueResult);
    }



    @Description("Write a Java program to find the duplicate values of an array of integer values")
    public static void findDuplicatesInArrayNew(int[] array) {
        int[] resultArray = {};
        for (int i=0; i < array.length; i++) {
            for (int j=i+1; j < array.length; j++) {
                if (array[i] == array[j] && arrayContainsValue(resultArray, array[i])==true) {
                    resultArray = resultArray;
                }
                else if (array[i] == array[j] && arrayContainsValue(resultArray, array[i])==false)  {
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



