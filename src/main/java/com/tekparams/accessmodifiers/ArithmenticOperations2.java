package com.tekparams.accessmodifiers;

public class ArithmenticOperations2 {
    int a;
    int b;
    int result;
    int addition(){
        result=a+b;
        return result;
    }
    int subtraction(){
        result=a-b;
        return result;
    }
    void displayResult(){
        System.out.println(a+"\n"+b);
    }
    ArithmenticOperations2(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmenticOperations2 obj1=new ArithmenticOperations2();

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.displayResult();

        obj1.subtraction();
        obj1.displayResult();

        int resultMain=obj1.addition();
        System.out.println(resultMain);
    }
}
