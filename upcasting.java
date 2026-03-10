/* Upcasting in Java

*/

class Demo{
    void print(){
        System.out.println("Print");
    }
}
class Demo1 extends Demo{
    void print(){
        System.out.println("HI");
    }
}
class Demo2 extends Demo{
    void print(){
        System.out.println("Hhello");
    }
}
class simulator{
    static void sim(Demo d){
        d.print();
    }
}
class main{
    public static void main(String[] args){
        Demo d1 = new Demo1();  //upcasting
        Demo d2 = new Demo2();  //upcasting
        simulator.sim(d1);      //will call demo1 print method because of upcasting
        simulator.sim(d2);      //will call demo2 print method because of upcasting
        Demo1 d3= new Demo1();
        simulator.sim(d3);      //will call demo1 print method because of upcasting
    }
}
/*
runtime polymorphism - the process of determining which method to call at runtime based on the actual object type.
example is d3 is of type Demo1 but it is upcasted to Demo and when we call print method inside simulator class 
it will call the print method of Demo1 because of runtime polymorphism.
POLYMORPHISM - many forms - one name but different forms. One object is showing different forms at different stages
    of its life cycle.
    Types of polymorphism
1) compile time polymorphism - method overloading and constructor overloading, static binding, early binding
    *compiler decides which method to call at compile time based on the reference type and parameters.
2) runtime polymorphism - method overriding and upcasting, late binding, dynamic binding.
   * at runtime, the JVM determines which method to call based on the actual object type, not the reference type. 
*/