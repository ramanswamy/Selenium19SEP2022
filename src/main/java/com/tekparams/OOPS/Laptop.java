package com.tekparams.OOPS;

public class Laptop {
    // Data Members
    float height;
    float width;
    String colour;
    Boolean hp;

    // Method
    void reading(){
       System.out.println("Reading");
    }
    void displayLaptop(){
        System.out.println(height+"\n"+width+"\n"+colour+"\n"+hp);
    }
    // Default Constructor
    // Constructor is used to initialize of an object
    Laptop(){
        height=10.2f;
        width=15.5f;
        colour="Grey";
    }

    // Parameterized Constructor
    // Parameterized constructor is also used to initialize an object.
    // You pass the values while creating the object iteself.
    Laptop(float height,float width, String colour, Boolean hp){
        this.height=height;
        this.width=width;
        this.colour=colour;
        this.hp=hp;
    }
    public static void main(String[] args){
        Laptop laptop  = new Laptop();
        Laptop laptop1 = new Laptop(14.3f,13.5f,"Blue",Boolean.TRUE);
        laptop.displayLaptop();
        laptop1.displayLaptop();
    }
}
