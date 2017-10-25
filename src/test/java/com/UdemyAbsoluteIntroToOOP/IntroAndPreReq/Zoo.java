package com.UdemyAbsoluteIntroToOOP.IntroAndPreReq;


public class Zoo {

    public static void main(String arg[]) {

        //Needed to comment this out because when I changed the Animal class into an abstract class I couldn't
        //instantiate the Animal class anymore.  You cannot instantiate an abstract class.
/*        Animals animal = new Animals("lion", "meat", "blond", 350, "roar");
        animal.name();
        animal.eat();
        animal.visual();
        animal.size();
        animal.action();*/


        Bird bird1 = new Bird("bird", "seeds", "multi colored", 2, "fly");
            // the 'bird1' variable points to the object's memory space that was created above using 'new Bird'
            // and then invoke the "name" method.
        bird1.name();
        //bird1.fly();
        bird1.eat();
        bird1.size();
        bird1.action();

        Chicken chick1 = new Chicken("chicken", "grain", "red", 1, "peck");
        chick1.name();
        //chick1.fly();   //this comes from Animal via Bird.
        chick1.eat();   // this comes from Bird.
        chick1.size();  //this comes from Animal via Bird.
        chick1.action();//this comes from Animal via Bird.


        Sparrow spar1 = new Sparrow("Sparrow", "small rodents", "brown", 3, "dive bomb");
        spar1.name();
        spar1.fly();
        spar1.eat();
        spar1.visual();
        spar1.size();
        spar1.action();
        spar1.move();


    }

}
