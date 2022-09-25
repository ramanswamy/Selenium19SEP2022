package com.tekparams.accessmodifiers;

public class ArithmenticOperations4 {
    public int a;
    public int b;
    public int result;
    public int addition(){
        result=a+b;
        return result;
    }
    public int subtraction(){
        result=a-b;
        return result;
    }
    public void displayResult(){
        System.out.println(a+"\n"+b);
    }
    public ArithmenticOperations4(){
        a=100;
        b=200;
    }
    public static void main(String[] args){
        ArithmenticOperations4 obj1=new ArithmenticOperations4();

        System.out.println(obj1.a);
        System.out.println(obj1.b);

        obj1.displayResult();

        obj1.subtraction();
        obj1.displayResult();

        int resultMain=obj1.addition();
        System.out.println(resultMain);
    }
}
