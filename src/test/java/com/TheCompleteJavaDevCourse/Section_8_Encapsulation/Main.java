package com.TheCompleteJavaDevCourse.Section_8_Encapsulation;


public class Main {

    public static void main(String[] args) {

        System.out.println("********** Part 1 - Demo ");

        Player player = new Player("Rockie", 50, "sword");
        System.out.println("Status of health of player is = " + player.getHealth());

        System.out.println("********** Part 2 - Challenge \n ");

        // Create a class called Printer and demonstrate proper encapsulation techniques.
        // It will simulate a real computer printer. It should have fields for toner level, number
        // of pages printed, and a setting to indicate 'two-sided'.  Print a message if set to 'two-sided'.
        // Add methods to fill up the toner (up to a max of 100%), and another method simulate printing
        // a page (which should increase the number of pages printed).
        // Decide on the scope, whether to use constructors, and anything else you think is needed.

        Printer print1 = new Printer(10, 10, true);

        print1.getNumberOfCopies();
        print1.isTwoSided();
        print1.getToner();
        print1.fillToner(10);

        System.out.println("********** Part 2 - Another way to do the challenge  \n ");

        Printer2 printer2 = new Printer2(50, true);
        System.out.println("Initial page count = " + printer2.getPagesPrinted());
        int pagesPrinted = printer2.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " and new total = " + printer2.getPagesPrinted());
        pagesPrinted = printer2.printPages(6);
        System.out.println("Pages printed was " + pagesPrinted + " and new total = " + printer2.getPagesPrinted());
    }
}
