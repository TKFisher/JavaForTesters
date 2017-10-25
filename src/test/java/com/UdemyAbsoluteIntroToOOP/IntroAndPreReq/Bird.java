package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;

// the Bird is child or sub class of Animal, the parent class.
public class Bird extends Animals {

    /**
     * Constructor:   The constructor is actually built into every class by default and I don't really need to call
     * out like this.... to prove it I will comment it out and the functionality that it offers will still apply
     * in the rest of my program.
     *
     * Also note:  If you extend a class (example extend it to Animal class) then the default constructor will no longer work
     * as the way the Bird class is constructed is different from the Animal (paren) class because the Animal class is
     * constructed with a bunch of params that the Bird class does not currently need to be constructed when constructed without
     * the extension.
     **/
/*    public Bird(){
    }*/

    /**
     * We will change the Bird constructor.
     */

    public Bird(String name, String food, String color, int weight, String action) {
        /**
         * Becauce we extended the Bird class with the Animal class we can no longer use the Bird class default
         * construct, and instead, need to create a Bird constructor that looks identical to the Animal constructor
         * using the same params and then use 'super' to call the Animal contructor.
         */
        super(name, food, color, weight, action);
    }

/*    // I am commenting this out and using the Fly method instead created in the abstract interface class called Flyable.
    public void fly() {
        System.out.println("method from Bird class: " + "I like to fly.");
    }*/

    //
    public void  move(){
        System.out.println("Flapping wings....");
    }






}
