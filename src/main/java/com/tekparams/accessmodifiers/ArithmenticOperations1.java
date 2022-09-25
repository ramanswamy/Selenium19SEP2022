package com.tekparams.accessmodifiers;

public class ArithmenticOperations1 {
    private int a;
    private int b;
    private int result;
    private int addition(){
        result=a+b;
        return result;
    }
    private int subtraction(){
        result=a-b;
        return result;
    }
    private void displayResult(){
        System.out.println(a+"\n"+b);
    }
    private ArithmenticOperations1(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmenticOperations1 obj1=new ArithmenticOperations1();

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.displayResult();

        obj1.subtraction();
        obj1.displayResult();

        int resultMain=obj1.addition();
        System.out.println(resultMain);
    }
}
