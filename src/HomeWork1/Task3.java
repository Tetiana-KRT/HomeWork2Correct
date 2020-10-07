package HomeWork1;

import jdk.jfr.Description;

public class Task3 {
    public static void main(String[] args){
        int a = 125;
        int b = 24;

        sum(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
        remainder(a, b);
    }

    @Description("Write a Java program to print the sum (addition), multiply, subtract, " +
            "divide and remainder of two numbers.(Create a separate method for each operation)")
    public static void sum(int a, int b) {
        int c = a+b;
        System.out.println(a + " + " + b + " = " + c);
    }
    public static void multiply(int a, int b) {
        int c = a*b;
        System.out.println(a + " x " + b + " = " + c);
    }
    public static void subtract(int a, int b) {
        int c = a-b;
        System.out.println(a + " - " + b + " = " + c);
    }
    public static void divide(int a, int b) {
        if (b!=0) {
            int c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        } else {
            System.out.println("It is impossible to divide by 0");
        }
    }
    public static void remainder(int a, int b) {
        if (b!=0) {
            int c = a % b;
            System.out.println(a + " mod " + b + " = " + c);
        } else {
        System.out.println("It is impossible to divide by 0");
    }
    }
}



