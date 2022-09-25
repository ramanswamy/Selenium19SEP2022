package com.tekparams.accessmodifiers;

public class ArithmenticOperations3 {
    protected int a;
    protected int b;
    protected int result;
    protected int addition(){
        result=a+b;
        return result;
    }
    protected int subtraction(){
        result=a-b;
        return result;
    }
    protected void displayResult(){
        System.out.println(a+"\n"+b);
    }
    protected ArithmenticOperations3(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmenticOperations3 obj1=new ArithmenticOperations3();

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.displayResult();

        obj1.subtraction();
        obj1.displayResult();

        int resultMain=obj1.addition();
        System.out.println(resultMain);
    }
}
