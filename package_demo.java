// abstraction - Abstraction is a fundamental concept in object-oriented programming that allows
//  developers to focus on the essential features of an object while hiding the unnecessary details. 
// It helps in reducing complexity and increasing efficiency by providing a clear separation between what an 
// object does and how it does it.

/* Encapsulation - Encapsulation is the bundling of data and methods that operate on that data within a single unit, 
typically a class. It helps in protecting the internal state of an object from unauthorized access and modification. */

package demo;
public abstract class package_demo{
    abstract void print();   // abstract method - coz no method body in this method. inherticance is must for abstract method.
    //  we cant create object of abstract class but we can create reference variable of abstract class. overriding is also needed
    //for implementation of abstract method. 
    abstract void display();
}

//the class inside which implementaion is being done is called as -implementaion class. it is also called as concrete class.
class implementaion_Class extends package_demo{
    void print(){  // overriding the abstract method of package_demo class in implementaion_Class class
        System.out.println("This is implementation class");
    //if i am implementing only one abstract method of package_demo, it will give me error.
    //i have to implement all the abstract methods of package_demo class in implementaion_Class class. 
    }
    void display(){
        System.out.println("This is display method of implementation class");  
    }
  
    

}


//interface 

interface Innerpackage_demo {
/* all methods of interface are abstract and public by default. 
we cant create object of interface but we can create reference variable of interface. 
implementation is also needed for interface methods. */
    void print();  // abstract method
    void display(); // abstract method
    
}
//interfaace to class the key word - implement.
//interface to interface the key word - extends. 
//class to class the key word - extends.
// we can extend multiple interfaces but we cant implement multiple classes.
class implmentation_class2 implements Innerpackage_demo{
    // void print(){
    //     System.out.println("This is implementation class 2");
    // }
    //this is wrong coz i cant override coz every method inside implementation_class2 is public by default and
    //  i am trying to override it with default access modifier.

    public void print(){
        System.out.println("This is implementation class 2");
    } //this is correct coz i am overriding it with public access modifier which is the default access modifier of
    //  interface methods.
    public void display(){
        System.out.println("This is display method of implementation class 2");
    }
}

//interface to class - i can inhertic multiple interface classes 
interface innerpackage_demo2{
    void show();
}
class implementation_class3 implements Innerpackage_demo, innerpackage_demo2{
    public void print(){
        System.out.println("This is implementation class 3");
    }
    public void display(){
        System.out.println("This is display method of implementation class 3");
    }
    public void show(){
        System.out.println("This is show method of implementation class 3");
    }
}

//if i dont want to implement all the methods of interface then i can declare my class as abstract class.
abstract class implementation_class4 implements Innerpackage_demo, innerpackage_demo2{  //multiple inherticance implementation
    // i am not implementing all the methods of interface so i have to declare my class as abstract class. 

}

interface demo3 extends innerpackage_demo2{  //interface to interface inheritance
    void display();
}


/*
The 5 pillars of Object-Oriented Programming (OOP) are Encapsulation (bundling data/methods),
 Inheritance (reusing code via child classes), Polymorphism (one interface, many implementations), 
 Abstraction (hiding complexity), and Classes/Objects (the blueprints and instances) */