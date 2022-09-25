package com.tekparams.inheritancedemo;

public class Employee {
    protected int empNo;
    protected String empName;
    protected int basicSalary;

    protected Employee(){
        empNo=1001;
        empName="Raja";
        basicSalary=50000;
    }

    protected void addEmployee(){
        empNo=1002;
        empName="Kumar";
        basicSalary=60000;
    }
    protected void displayEmployee(){
        System.out.println(empNo+"\n"+empName+"\n"+basicSalary);
    }
}
