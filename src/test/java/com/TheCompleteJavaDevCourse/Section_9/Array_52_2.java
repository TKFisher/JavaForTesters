package com.TheCompleteJavaDevCourse.Section_9;


import java.util.Scanner;

public class Array_52_2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed values was " + myIntegers[i]);
        }

        //Finally we pass in our array variable into our method "getAverage" and print result to screen.
        System.out.println("The average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        //dividing the total sum of all the value in the array by the length of the array (total sum / 5)
        return (double) sum / (double) array.length;
    }


}


