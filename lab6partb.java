class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
class Student {
    int rollNo;
    String name;
    int age;
    String course;
    Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15-21)");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}
public class lab6partb {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Rahul", 23, "B.Tech");
            s1.display();
        } 
        catch (AgeNotWithinRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
