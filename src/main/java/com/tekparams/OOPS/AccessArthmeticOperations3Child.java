package com.tekparams.OOPS;

import com.tekparams.accessmodifiers.ArithmenticOperations3;

public class AccessArthmeticOperations3Child extends ArithmenticOperations3 {
    // Example for Default Access Modifier
    //ArithmenticOperations2 obj1 = ArithmenticOperations2();
    public static void main(String[] args){
        AccessArthmeticOperations3Child obj1 = new AccessArthmeticOperations3Child();
        obj1.addition();
        obj1.displayResult();
    }
}
