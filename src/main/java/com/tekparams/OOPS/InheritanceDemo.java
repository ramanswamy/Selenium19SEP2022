package com.tekparams.OOPS;

import com.tekparams.inheritancedemo.Employee;

public class InheritanceDemo extends Employee {
    int bonus;

    void displayBonus(){
        System.out.println(bonus);
    }

    InheritanceDemo(){
        bonus=10000;
    }

    public static void main(String[] args) {
        InheritanceDemo obj1 = new InheritanceDemo();
        // code resuability of the parent class information
        obj1.addEmployee();
        obj1.displayEmployee();
        obj1.displayBonus();
    }
}
