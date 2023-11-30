//package com.mycompany.midexam;

 class animal {
    void sound()
    {
        System.out.println("the cat");
    }
}
class cat extends animal{
    void sound()
    {
        System.out.println("The animal");
    }
}
public class Animal{
    public static void main(String[] args) {
        animal ani = new animal();
        cat Cat=new cat();
        ani.sound();
        Cat.sound();
    }
}
