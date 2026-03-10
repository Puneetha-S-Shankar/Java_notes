//packages in java
//project -> src ->
//                  package1 -> different java files c1.java, c2.java
//                  package2 -> different java files c3.java, c4.java
//package is a way to organize our java files

package package1;
import package2.*; //importing all the classes from package2 (1st way to import)
class c1{}
class c2{}

package package2;
import package1.c1; //importing c1 class from package1 (spcific class) (2nd way to import)
class c3{
    c1 obj = new c1(); //creating object of c1 class in c3 class
    package1.c2 obj1 = new package1.c2(); //creating object of c2 class in c3 class (3rd way to import )
}
class c4{}
