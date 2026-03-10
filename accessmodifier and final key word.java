// read package.java file before this file to understand the concept of package in java.
// types of access modifier
// 1. public: The member is accessible from any other class.
// 2. private: The member is accessible only within the class it is declared.
// 3. protected: The member is accessible within the same package and subclasses.
// 4. default (no modifier): The member is accessible only within the same package. 


// if u are importing a class from another package then you can access the default memebers 
// to your class.


//if its a protected memebrr then we have to import andd then extend the class to access 
// the protected members of that class. cant extend without importing the class.

package package1;
class c1{
    protected int x = 10;
}

package package2;
import package1.c1;
class c2 extends c1{
    void display(){
        System.out.println(x); //accessing protected member of c1 class in c2 class
    }
}

package package3;
class c3{
    public int x;   //can access x without importing without extending
    int y;  //can access y with importing without extending
    protected int z; //can access z with importing and extending
    private int a; //cant access private member of c3 class in c4 class 
}
class c4{
    void display(){
        //cant access private member of c3 class in c4 class 
        //can access x without importing without extending
        //can access y with importing without extending
        //can access z with importing and extending
         c3 obj = new c3();
         System.out.println(obj.x);
         System.out.println(obj.y);
         // System.out.println(obj.z); //cant access protected member of c3 class in c4 class
    }
}

//FINAL KEY WORD
// final keyword is used to declare a constant variable, method or class.
// final variable: A final variable is a constant variable that cannot be changed once it is initialized.
// final method: A final method cannot be overridden by subclasses.
// final class: A final class cannot be extended by any other class. cant import a final class 