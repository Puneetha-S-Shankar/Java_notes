/*Method overloading : - developing mulstiple method with the same name but with different parameters , 
then its called method overloading.
IF we do the same thing with a constructor its called constructor overloading
Rule : 
1. Method name must be same.
2. Parameter can be different either order, number of parameters or datatype.

Error- if same name and same parameters- complie time error- complie cime polymorphism. 

*/
class Demo{
    void sum(int a, int n){
        
            System.out.println("The sum of two numbers is : " + (a+n));
        
    }
    void sum(float a, float b){
        System.out.println("The sum of two numbers is : " + (a+b));
    }
    void sum(int a, float b){
        System.out.println("The sum of two numbers is : " + (a+b));
    }

}



/*  
constructors continued
*/
public class Students {
    int roll;
    String name;    
    String section;
    {
        this.section="A";
    }
    Students(int roll, String name){
        this.roll=roll;
        this.name=name; 
    }
    void display(){
        System.out.println("Roll no : " +  this.roll);
        System.out.println("Name : " + this.name);
        System.out.println("Section : " + this.section);
    }
    public static void main(String[] args) {
        Students s1=new Students(101,"Alice");
        s1.display();

    }
}

