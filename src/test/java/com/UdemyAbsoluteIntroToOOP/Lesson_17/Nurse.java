package com.UdemyAbsoluteIntroToOOP.Lesson_17;


public class Nurse extends Employee {

    // a constructor that passed in arguments via the extended Employee object.
    public Nurse(int id, String name, String department, boolean working) {
        super(id, name, department, working);

        System.out.println("Nurse in action ...");
    }

    // This comes from the Employee class as an abstract method and can be used
    // to perform duties associated to this class.
    @Override
    public void performDuties() {
        checkVitalSigns();
        drawBlood();
        cleanPatientArea();
    }


    // Nurse Duties:
    private void checkVitalSigns() {
        System.out.println("Check Vitals.");
    }

    private void drawBlood() {
        System.out.println("Draw Bood.");
    }

    private void cleanPatientArea() {
        System.out.println("Clean Patient Area");
    }
}
