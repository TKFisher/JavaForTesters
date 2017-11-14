package com.TheCompleteJavaDevCourse.Section_8_Composition;


public class Main {

    public static void main(String[] args) {

        // Example of initializing the Dimensions() class first before passing the arguments to the variable in the Case() class.
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2200", "Dell", "240", dimensions);

        // Another way is to initialize the class as an argument.
        Monitor theMonitor = new Monitor("27 inch beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getTheCase().pressPowerButton();

    }
}
