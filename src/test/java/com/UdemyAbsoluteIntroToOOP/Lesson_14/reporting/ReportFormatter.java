package com.UdemyAbsoluteIntroToOOP.Lesson_14.reporting;


/**
 * Note regarding using the Object class as an argumment:
 * We add the Object class as an argument for each method because this is the parent of all objects and by
 * adding this here we will be able to pass any other object as a argument (ie the Employee object)
 */

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType) {

        //check to see which format type it is and convert the object to string and store it in 'formattedOutput'.
        switch (formatType) {
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = convertObjectToCSV(object);
                break;
        }

    }

    private String convertObjectToXML(Object object) {
        return "XML : <title>" + object.toString() + "</title>";
    }

    private String convertObjectToCSV(Object object) {
        return "CSV : ,,,," + object.toString() + ",,,,,";
    }

    // This is a getter method to return the value contained in the variable "formattedOutput".
    protected String getFormatterValue() {
        return formattedOutput;
    }

}
