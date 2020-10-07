package HomeWork1;

import jdk.jfr.Description;

public class Task1 {
    public static void main(String[] args){
        sumOfTwoNumbers(74, 36);
    }

    @Description("Write a Java program to print the sum of two numbers")
    public static void sumOfTwoNumbers(int a, int b) {
        int c = a+b;
        System.out.println(c);
    }
}



