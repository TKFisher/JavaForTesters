package com.UdemyAbsoluteIntroToOOP.Loops;

import java.util.Scanner;

public class MoreLoops {


    /*I got this example from a Lynda.com tutorial and it does not actually work as. It continues in loop with no stopping. */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {



        int choice = 0;
        do {
            System.out.println("Choose and item from the  list below.");
            System.out.println("______________________________________");
            System.out.println("1. Hot dog");
            System.out.println("2. Hamburger");
            System.out.println("3. Pizza");
            System.out.println("4. Cheeseburger");
            System.out.println("5. Veggie Burgger");
        }
        while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5);
        switch (choice) {
            case 1:
                System.out.println("You chose hot dog.");
                break;
            case 2:
                System.out.println("You chose hambergurg.");
                break;
            case 3:
                System.out.println("You chose pizza.");
                break;
            case 4:
                System.out.println("You chose cheese burger.");
                break;
            case 5:
                System.out.println("You chose veggie burgher.");
                break;
            default:
                System.out.println("Have a good day.");
                break;
        }



        double loanBalance = 5000;
        int months = 0;
        while(loanBalance > 0){
            loanBalance -= 500;
            months ++;
        }

        //System.out.println("It will take " + months " months to pay back this load.");

    }
}
