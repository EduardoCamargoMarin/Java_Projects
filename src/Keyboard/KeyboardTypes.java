package Keyboard;

import Keyboard.Interfaces.KeyboardLayout;

public class KeyboardTypes {
    //attributes
    String type;
    String brand;

    //Constructor
    public KeyboardTypes() {

    }


    public KeyboardTypes(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    //method
    public void typing() {
        type = "switch brown";
        brand = "Red dragon";
        System.out.println("I´m typing on a " + type +" " + brand + " keyboard");
    }
}


