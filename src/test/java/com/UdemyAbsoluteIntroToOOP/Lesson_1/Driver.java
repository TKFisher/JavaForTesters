package com.UdemyAbsoluteIntroToOOP.Lesson_1;

/**
 *  Associations define a relationship between classes. There are different kinds of Associations.
 *  - Dependency Association
 *  - Composition Association (composed of other objects that make up a hole)
 *  - Aggregation Association
 *
 *  This Drive object is an example of a Dependency Association where by the Driver class depends on the Vehicle object
 *  passed as an argument in the drive method.
 *
 *  The Driver receives a Vehicle reference (raceCar) only in the scope of the drive operation (method).
 *
 *  The association is formed in terms of the scope of the operation not the class in general.
 */
public class Driver {

    public void drive (Vehicle raceCar){
        raceCar.accelerate();
    }


}
