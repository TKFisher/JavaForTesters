package com.UdemyAbsoluteIntroToOOP.Lesson_14.reporting;

import com.UdemyAbsoluteIntroToOOP.Lesson_14.domain.Employee;


public class EmployeeReportFormatter extends ReportFormatter {


    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super(employee, formatType);
    }

    //This returns the call from the getFormatterValue() from the ReportFormatter class.
    public String getFormattedEmployee() {
        return getFormatterValue();
    }


}
