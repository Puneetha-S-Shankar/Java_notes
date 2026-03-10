class Vehicle{
    void run( ){System.out.println("Vehicle is running");}
    void print(){System.out.println("hello");}
}

class Bike2 extends Vehicle{
    void run( ){System.out.println("Bike is running safely");}
    void display(){System.out.println("diplay");}

public static void main(String args[ ]){
    Bike2 obj = new Bike2( );//creating object
    Vehicle obj1 = new Vehicle( );
    Vehicle obj2 = new Bike2();
    // obj2.run();
    // obj2.print();
  
   
    obj.run( );//calling method
    obj.print();  
      obj.display(); 
    obj1.print();
     obj1.run();
  obj1.display();
}
}