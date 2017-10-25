package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Zoo_2 {

    public static void main(String[] args) {

        Flyable flyingBird = new Sparrow_2("Charlie", "grain", "brown", 4, "dance");
        flyingBird.fly();
    }


    /**
     * Used for Abstract Classes demo
     */
/*
    public static void main(String[] args) {

        Animals_2 sparrow2 = new Sparrow_2("Freddy", "corn", "blue and yellow", 2, "charming");
        //sparrow2.move();

        Animals_2 fish2 = new Fish_2("Joe", "flies", "green", 1, "serious");
        //fish2.move();

        // If you comment out the above sparrrow2.move and fish2.move lines then these lines will do the same.
        moveAnimal(fish2);
        moveAnimal(sparrow2);

    }
    // This is an example of Polymorphism:
    public static void moveAnimal(Animals_2 animal) {
        animal.move();

    }
*/

}
