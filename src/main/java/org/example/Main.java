package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        math();
        stringReplace();
        System.out.println(reverseWords("This reverse every word in a sentence"));
        System.out.println(reverseSentence("This to reverse the whole string"));
        //multiply();
        System.out.println(stringCount("hello", 'l'));

    }


    /* https://www.codewars.com/kata/5865918c6b569962950002a1/train/java */
    public static int stringCount(String str, char letter) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }


    /*
    https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java
     for some reason it is not passing in codewars cuz of double space
    */
    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder(word).reverse();
            reversedSentence.append(reverseWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static String reverseSentence(String hello) {
        String[] split = hello.split("");
        Collections.reverse(Arrays.asList(split));

        return String.join("", split);
    }


    //    public static int multiply(int number) {
    //        return number * (int) Math.pow(5, (Math.abs(number) + "").length());
    //
    //    }


    private static String replaceWord(String input, String targetWord, String replacement) {
        // Use the replace method to replace the target word (case-insensitive)
        return input.replaceAll("(?i)" + targetWord, replacement);
    }

    private static void stringReplace() { // practice
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Define a list of word pairs to replace
        String[][] replacements = {
                { "hani", "name" },
                { "hello", "welcome" }
                // Add more word pairs as needed
        };

        // Perform case-insensitive multiple replacements
        String resultString = inputString;
        for (String[] replacement : replacements) {
            resultString = replaceWord(resultString, replacement[0], replacement[1]);
        }

        // Display the result
        System.out.println("Result: " + resultString);

        scanner.close();
    }

    private static void math() { // some practice
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the user's input for the first number
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the user's input for the second number
        double num2 = scanner.nextDouble();

        // Close the Scanner to prevent resource leaks
        scanner.close();

        // Perform calculations
        double sum = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;

        // Check if num2 is not zero before performing division
        double divide = num2 != 0 ? num1 / num2 : Double.NaN;

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum);
        System.out.println("Subtract: " + subtract);
        System.out.println("Multi: " + multiply);

        // Check if the result of division is a valid number
        if (!Double.isNaN(divide)) {

            System.out.println("Quotient: " + divide);
        }
        System.out.println("Cannot divide by zero.");
    }

    // https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
    }

    // https://www.codewars.com/kata/568dcc3c7f12767a62000038/train/java
    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Your code here...
        if (employed && vacation) {
            return false;
        } else if (employed && !vacation) {
            return true;
        } else if (!employed && vacation) {
            return false;
        } else if (!employed && !vacation) {
            return false;
        }
        return Boolean.parseBoolean(null); // what a stupid line huh haha
    }

    // https://www.codewars.com/kata/59ca8246d751df55cc00014c/train/java
    public static boolean hero(int bullets, int dragons) {
        return bullets >= 2 * dragons;
    }

    // https://www.codewars.com/kata/5625618b1fe21ab49f00001f/train/java
    public static String sayHello(String name) {

        return "Hello, " + name;
    }

    //https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java
    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }
}
