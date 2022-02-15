package com.eainde.assignment;

import java.io.IOException;

public class EmployeeMain {

    public static void main(String args[]){
        EmployeeService es = new EmployeeService();
        try {
            System.out.println(es.getAverageSalary());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
