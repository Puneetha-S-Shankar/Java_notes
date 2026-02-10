//Question 2
// class Q2{
//     void calculate(int a, int b){
//         System.out.println("Sum: " + (a+b));
//     }
//     public static void main(String [] args){
//         Q2 obj = new Q2();
//         obj.calculate(2, 3);

//     }
// }


//Question 3
// class firstClass{
//     void function1(){
//         System.out.println("This is first class");
//     }
   
// }
// class secondClass{
//  public static void main(String [] args){
//        firstClass obj = new firstClass();
//        obj.function1();

//     }
// }


//Question 4
// class firstClass{
//     int lenght;
//     int breadth;
   
// }
// class secondClass{

//     public static void main(String [] args){
//        firstClass obj = new firstClass();
//        obj.lenght=10;
//        obj.breadth=5;
//        System.out.println("Area: " + (obj.lenght*obj.breadth));


//     }
// }

class firstClass{
    int marks;
}
class secondClass{
    void calculate(firstClass obj){
        if(obj.marks>=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
class thirdClass{
    public static void main(String[] args){
        firstClass obj1= new firstClass();
        obj1.marks=75;
        
        secondClass obj2 = new secondClass();
        obj2.calculate(obj1);
    }
}

