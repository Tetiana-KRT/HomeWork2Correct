package HomeWork1;

import jdk.jfr.Description;

public class Task2 {
    public static void main(String[] args){
        taskA(-5, 8, 6);
        taskB(55, 9, 9);
        taskC(20, -3, 5, 8);
        taskD(5, 15, 3, 2, 8, 3);
    }

    @Description("Write a Java program to print the result of the following operations")
    public static void taskA(int a, int b, int c) {
        int d = a+b*c;
        System.out.println(d);
    }
    public static void taskB(int a, int b, int c) {
        if (c!=0) {
            int d = (a + b) % c;
            System.out.println(d);
        }else {
            System.out.println("It is impossible to divide by 0");
        }
    }
    public static void taskC(int a, int b, int c, int d) {
        if (d!=0) {
        int e = a+b*c/d;
        System.out.println(e);
        }else {
            System.out.println("It is impossible to divide by 0");
        }
    }
    public static void taskD(int a, int b, int c, int d, int e, int f) {
        if (c==0 || f==0) {
            System.out.println("It is impossible to divide by 0");
        }else {
            int g = a + b / c * d - e % f;
            System.out.println(g);
        }
    }
}



