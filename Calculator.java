class Calculator {

    
    static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

  
    static void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

  
    static void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

 
    static void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Division not possible (cannot divide by zero)");
        }
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;

        add(x, y);
        subtract(x, y);
        multiply(x, y);
        divide(x, y);
    }
}
