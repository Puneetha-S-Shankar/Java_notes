class lab4a {
    static class Student {
        int rollNo = 101;
    }
    static class Test extends Student {
        int marks = 85;
    }
    static class Sports extends Test {
        int sportsScore = 90;
        void display() {
            System.out.println("Roll No: " + rollNo);
            System.out.println("Marks: " + marks);
            System.out.println("Sports Score: " + sportsScore);
        }
    }
    public static void main(String[] args) {
        Sports s = new Sports();
        s.display();
    }
}

class lab4b {

    static class Shape {
        void area() {
            System.out.println("Calculating area...");
        }
    }
    static class Rectangle extends Shape {
        double length = 5, breadth = 3;
        void area() {
            System.out.println("Area of Rectangle: " + (length * breadth));
        }
    }
    static class Circle extends Shape {
        double radius = 4;
        void area() {
            System.out.println("Area of Circle: " + (Math.PI * radius * radius));
        }
    }
    public static void main(String[] args) {
        Shape s;
        s = new Rectangle(); 
        s = new Circle();
        s.area();
    }
}


class lab4c {
    static abstract class Bank {
        abstract int getBalance();
    }
    static class BankA extends Bank {
        int getBalance() {
            return 100;
        }
    }
    static class BankB extends Bank {
        int getBalance() {
            return 150;
        }
    }
    static class BankC extends Bank {
        int getBalance() {
            return 200;
        }
    }
    public static void main(String[] args) {
        Bank b1 = new BankA();
        Bank b2 = new BankB();
        Bank b3 = new BankC();
        System.out.println("Balance in Bank A: " + b1.getBalance());
        System.out.println("Balance in Bank B: " + b2.getBalance());
        System.out.println("Balance in Bank C: " + b3.getBalance());
    }
}
