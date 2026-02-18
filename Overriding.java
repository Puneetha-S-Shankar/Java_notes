/* Inheritance 
key word - "extends "

Super class demo "extends" demo 2.
Whenever extends is used - it is-a relationship.

___________ 
|   Demo  |  <---- Super class  
|_________| 
     ^ 
    / \        <---- is a relationship
    \ /
     v
     |
__________ 
|  Demo 2 |  <---- Chld class 
|_________| 
    
|
Sinulator class- class where all other class is called*/

class Demo{                 //Super class for demo2 and demo3
    void print(){};
    void sum(){};
}
class Demo2 extends Demo{   //child class of demo , and Super class of demo3
    void show(){};
}
class Demo3 extends Demo2{   //child class of demo2 and demo
    void display(){};
}
class simulator{
    public static void main(String[] args){
        Demo3 d = new Demo3();
        d.print();
        d.sum();
        d.show();       
        d.display();
    }
}



/*  
Composition - when one class contains the object of another class is called composition.
In composition, the contained object is a part of the containing class and cannot exist independently.
*/

/* 5 types of Inheritance 
1) single level - one super class and one child class
                class A
                   |
                Class B
2) multilevel inheritance - one super class and multiple child classes in a chain
                class A
                   |
                Class B
                   |
                Class C
3) hierarchical inheritance - one super class and multiple child classes sharing the same super class
                class A
                   |
                /  |  \
               /   |   \
              B    C    D
            
4) multiple inheritance - one child class inheriting from multiple super classes (not supported in Java)
It is possible using interferance and implemeents keyword not possible using extends keyword
                class A  class B
                    \      /
                     \    /
                     class C
5) hybrid inheritance - a combination of different types of inheritance
                class A
                   |
                /  |  \
               /   |   \
              B    C    D
                        |
                        |
                        E
        
*/

//Over riding

class D1{
    void sum(){
        System.out.println("Sum of two numbers");
    }
}
class D2 extends D1{
    void sum(){
        super.sum();
        System.out.println("Sum of three numbers");
    }
}
public class Overriding{
    public static void main(String[] args){
        D2 d = new D2();
        d.sum();       //will call D2 sum method but it will also call D1 sum method because of super keyword
    }
}
