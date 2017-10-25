package com.UdemyAbsoluteIntroToOOP.Lesson_17;

/**
 * This example uses abstraction on the Employee class.
 * We could have used an Interface instead as you will use in the Homework.
 */

public class EmergencyRoomProcess {

    public static void main(String[] args) {

        HospitalManagement ERDirector = new HospitalManagement();
        Employee peggy = new Nurse( 1, "Peggy", "emergency", true);

        ERDirector.callUpon(peggy);

        Employee suzan = new Doctor(2, "Suzan", "emergency", true);

        ERDirector.callUpon(suzan);


    }
}
