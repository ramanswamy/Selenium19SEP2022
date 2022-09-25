package com.tekparams.polymorphism;

public class MethodOverloadingDemo {
    int empNo;
    String empFirstName;
    String empMiddleName;
    String empLastName;
    int basicSalary;

//    MethodOverloadingDemo(){
//        empNo=0;
//        empFirstName=null;
//        empMiddleName=null;
//        basicSalary=0;
//    }

    void addEmployee(int empNo,String empFirstName,int basicSalary){
        this.empNo=empNo;
        this.empFirstName=empFirstName;
        this.basicSalary=basicSalary;
    }
    void addEmployee(int empNo,String empFirstName,String empMiddleName, int basicSalary){
        this.empNo=empNo;
        this.empFirstName=empFirstName;
        this.empMiddleName=empMiddleName;
        this.basicSalary=basicSalary;
    }


    void displayEmployee(){
        System.out.println(empNo+"\n"+empFirstName+"\n"+empMiddleName+"\n"+empLastName+"\n"+basicSalary);
    }

    public static void main(String[] args) {
        MethodOverloadingDemo obj1 = new MethodOverloadingDemo();
        MethodOverloadingDemo obj2 = new MethodOverloadingDemo();

        obj1.addEmployee(1001,"Raja",40000);
        obj2.addEmployee(1002,"Kumar","PP",50000);
        obj1.displayEmployee();
        obj2.displayEmployee();
    }
}
