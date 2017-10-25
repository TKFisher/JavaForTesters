package com.Scratch;

import java.util.*;

public class W3resource1 {


    public static void main(String[] args) {

        reverseListString ();
    }

    // 1
    public static void printName(String name) {

        System.out.println(name);
    }

    public static void printGreeting() {

        System.out.println("Hello");

    }

    public static void printGreetAndName() {

        System.out.println("Hello\nTracy");

    }

    // 2
    public static void printSum() {
        int sum1 = 74;
        int sum2 = 36;

        System.out.println(sum1 + sum2);
    }

    public static int printSumWithArgs(int sum1, int sum2) {

        int output = sum1 + sum2;
        System.out.println(output);
        return output;
    }

    // 3
    public static int printDivTwoInts(int num1, int num2) {

        int output = num1 / num2;
        System.out.println(output);
        return output;
    }

    // 4
    public static void printResultsOfFourEquations() {

        int output1 = -5 + 8 * 6;
        System.out.println(output1);

        int output2 = (55 + 9) % 9;
        System.out.println(output2);

        int output3 = 20 + -3 * 5 / 8;
        System.out.println(output3);

        int output4 = 5 + 15 / 3 * 2 - 8 % 3;
        System.out.println(output4);
    }

    // 5
    public static int printProductOfTwoNumbers(int num1, int num2) {

        int output = num1 * num2;
        System.out.println(output);
        return output;
    }

    // 6
    public static void printMultipleResultsWithTwoInputs(int num1, int num2) {
        int output1 = num1 + num2;
        int output2 = num1 - num2;
        int output3 = num1 * num2;
        int output4 = num1 / num2;
        int output5 = num1 % num2;

        System.out.println(output1
                + "\n" + output2
                + "\n" + output3
                + "\n" + output4
                + "\n" + output5);
    }

    // 7
    public static void multiplyUpToTen(int num) {
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        ...
//        8  x 10       = 80
//       num x iterater = output  ... actually, this variable is not needed.

        int output = 0;

        for (int i = 1; i <= 10; i++) {

            //System.out.println(output = num * i);
            // System.out.println(num * i);
            System.out.println(num + " + " + i + " = " + num * i);
        }


    }

    // 8
    public static void printJavaStringPattern() {
        System.out.println("   J    a   v     v  a  ");
        System.out.println("   J   a a   v   v  a a ");
        System.out.println("J  J  aaaaa   V V  aaaaa ");
        System.out.println(" JJ  a     a   V  a     a");
    }

    // 9
    public static void printExpression() {
        //((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))

        double val1 = 25.5;
        double val2 = 3.5;
        double val3 = 40.5;
        double val4 = 4.5;
        double output = ((val1 * val2 - val2 * val2) / (val3 - val4));

        System.out.println(output);
    }

    //10

    public static void printOutputForFormula() {

        // 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))

        double output = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));

        System.out.println(output);
    }

    // 11
    public static void printAreaAndPerimeterOfACircle() {
        // A = π r2
        // P = 2 π r
        double radius = 7.5;
//        double pi = 3.1415926545880506;
//        double area = (pi * (radius * radius));
        double area = (Math.PI * (radius * radius));
//        double perim = (2 * pi * radius);
        double perim = Math.PI * 2 * radius;
        System.out.println("The area of a circle is " + area + " if the radius is " + radius);
        System.out.println("The perimeter of a circle is " + perim + " if the radius is " + radius);

    }

    // 12
    public static void printAverageOfThreeNumbers(int num1, int num2, int num3) {

        int output = ((num1 + num2 + num3) / 3);
        System.out.println("The average of 3 numbers is " + output);

    }

    // 13
    public static void printAreaAndPerimeterOfARectangle() {

        double width = 5.5;
        double height = 8.5;
        double area = width * height;
        double perim = (2 * (width * height));

        System.out.println("The area of a rectangle is " + area);
        System.out.println("The perimeter of a rectangle is " + perim);

    }

    // 14
    public static void printAmericanFlag() {

        System.out.println(
                "* * * * * * ==================================                          \n" +
                        " * * * * *  ==================================                          \n" +
                        "* * * * * * ==================================                          \n" +
                        " * * * * *  ==================================                          \n" +
                        "* * * * * * ==================================                          \n" +
                        " * * * * *  ==================================                          \n" +
                        "* * * * * * ==================================                          \n" +
                        " * * * * *  ==================================                          \n" +
                        "* * * * * * ==================================                          \n" +
                        "==============================================                          \n" +
                        "==============================================                          \n" +
                        "==============================================                          \n" +
                        "==============================================                          \n" +
                        "==============================================                          \n" +
                        "==============================================");

    }

    // 15
    public static void swapTwoVariablesUsingThirdVariable() {

        int temp = 0;
        int var1 = 5;
        int var2 = 10;
        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);

        temp = var1;
        var1 = var2;
        var2 = temp;

        System.out.println("Variable 1 is now: " + var1 + "\n"
                + "Variable 2 is now: " + var2);

    }

    public static void swapTwoVariablesWithoutThirdVariable() {

        int a, b;
        a = 15;
        b = 27;
        System.out.println("Before swapping : a, b = " + a + ", " + +b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a, b = " + a + ", " + +b);

    }

    // 16
    public static void printFace() {
        System.out.println(" +\"\"\"\"\"+                                                 \n" +
                "[| o o |]                                                \n" +
                " |  ^  |                                                 \n" +
                " | '-' |                                                 \n" +
                " +-----+");
    }

    // 17 to 30 - come back to these: binary, octal, hexadecimal numbers
    public static void displayBinaryNumber() {

        int num1 = 0b1010;
        int num2 = 0b1011;

        int output = num1 + num2;

        System.out.println(output);
    }

    // 31
    public static void checkIfJavaIsInstalled() {

        // System.out.println(System.getProperties());
        // System.getProperties().list(System.out);
        System.out.println(System.getProperty("java.version"));
    }

    // 32
    public static void compareTwoNumbers () {

        int firstInt = 0;
        int secondInt = 0;

        try (Scanner myScans = new Scanner(System.in)) {

            System.out.println("Enter first number. ");
            firstInt = myScans.nextInt();

            System.out.println("Enter second number. ");
            secondInt = myScans.nextInt();

            System.out.println("First number = " + firstInt +  "  and the second number = " + secondInt + "\n ");

            if(firstInt != secondInt)
            {System.out.println(firstInt + " != " + secondInt);}
            if (firstInt < secondInt)
            {System.out.println(firstInt + " < " + secondInt);}
            if (firstInt <= secondInt)
            {System.out.println(firstInt + " <= " + secondInt);}
        }
    }

    // 33
    public static void computeSumOfInts () {
        // note: see solution for this excercise. It's different than this one.

        int m, n, sum = 0;

        try (Scanner myScan = new Scanner(System.in)) {
            System.out.println("Enter a number. ");

            m = myScan.nextInt();
            while(m > 0)

            {
                n = m % 10;
                sum = sum + n;
                m = m / 10;
            }

            System.out.println("Sum of Digits: "+ sum);
        }
    }


    // 37
    public static void reverseString () {

        String myString = null;
        String[] myArray = new String[6];

        try (Scanner myScan = new Scanner(System.in)) {
            System.out.println("Enter a 5 character string. \r");
            myString = myScan.nextLine();

            myArray = myString.split("");

            for (int i = 0; i < myArray.length; i++){
                System.out.println(myArray[i]);
            }

            System.out.println("Should see the reverse of the string below: ");

            for (int i = 6; i >=0 ; i--){
                System.out.println(myArray[i]);
            }
        }
    }

    // tried to do this with a List but it does not work.  TODO: fix this
    public static void reverseListString () {

        // List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));

        String myString = null;
        List<String> myArray = new ArrayList<String>();

        try (Scanner myScan = new Scanner(System.in)) {
            System.out.println("Enter a character string.");
            myString = myScan.nextLine();
            myArray = Arrays.asList(myString.split(","));

            for (int i = 0; i < myArray.size() ; i++){
                System.out.println(myArray);
            }

            for (int i = myArray.size(); i >=0 ; i--){
                System.out.println(myArray);
            }
        }
    }
}
