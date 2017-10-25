package com.UdemyAbsoluteIntroToOOP.Lesson_14.client;

/**
 * This is out sandbox, or testing class for all of our other methods.
 */

import com.UdemyAbsoluteIntroToOOP.Lesson_14.domain.Employee;
import com.UdemyAbsoluteIntroToOOP.Lesson_14.domain_dao.EmployeeDAO;
import com.UdemyAbsoluteIntroToOOP.Lesson_14.reporting.EmployeeReportFormatter;
import com.UdemyAbsoluteIntroToOOP.Lesson_14.reporting.FormatType;

public class ClientModule {

    public static void main(String[] args){

        Employee peggy = new Employee(1,"peggy","accounting",true);
        ClientModule.hireNewEmployee(peggy);

        //(Option 1)
        //printEmployeeReport(peggy);

        //(Option 2)
        printEmployeeReport(peggy, FormatType.XML);

    }


    public static void hireNewEmployee(Employee employee){
        // instance  of EmployeeDOA in order to save to the database.
        EmployeeDAO employeeDOA = new EmployeeDAO();
        employeeDOA.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee){
        // instance of EmployeeDOA in order to delete from database.
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }

    //(Option 1)
/*    public static void printEmployeeReport(Employee employee){
        // instance of EmployeeReportFormater
        EmployeeReportFormatter reportForm = new EmployeeReportFormatter(employee, FormatType.CSV);
        System.out.println(reportForm.getFormattedEmployee());
    }*/

    //(Option 2 with his correction)
    // We added another argument for FormatType to allow us to set the format type in the above
    // test method.
    public static void printEmployeeReport(Employee employee, FormatType formatType){
        // Changed argument here too to "formatType".
        EmployeeReportFormatter reportForm = new EmployeeReportFormatter(employee, formatType);
        System.out.println(reportForm.getFormattedEmployee());
    }
}
