package HomeWork1;

import jdk.jfr.Description;

public class Task6 {
    public static void main(String[] args){
        String string1 = "PHP Exercises and";
        String string2 = "Python Exercises";
        concatenateTwoStringsAndRemoveP(string1, string2);
    }

    @Description("Write a Java program to concatenate a given string to the end of another string. " +
            "And remove all `P` or `p` characters.")
    public static void concatenateTwoStringsAndRemoveP(String string1, String string2) {
        String result = (string1 + " " + string2).replaceAll("P", "").
                replaceAll("p", "");
        System.out.println("The concatenated string with replacements: " + result);
    }
}



