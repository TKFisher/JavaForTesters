package com.UdemyAbsoluteIntroToOOP.Lesson_14.domain_dao;

import com.UdemyAbsoluteIntroToOOP.Lesson_14.domain.Employee;

/**
 * This class is responsible for carrying out data specific operations for employees.
 * DAO = data access object.
 * This class has a dependency on the DatabaseConnectionManager class.
 */

public class EmployeeDAO {

    public void saveEmployee(Employee emp) {
        //This is typical way but for our example we will comment this out and just print a SOUT.
/*        DatabaseConnectionManager connectionManager =  DatabaseConnectionManager.getManagerInstance();
        connectionManager.connect();
        connectionManager.getConnectionObject().prepareStatement("insert  into Employee_table");
        connectionManager.disconnect();*/
        System.out.println("saved employee to the database: " + emp);
    }

    public void deleteEmployee(Employee emp) {

        System.out.println("deleted employee to the database: " + emp);

    }


}



