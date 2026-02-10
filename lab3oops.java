class Q5{
    public static void fib(int n) {
        System.out.print("Fibonacci series: ");
        int a=0, b=1;
        System.out.print(a + " " + b + " ");
       for(int i=2;i<n;i++){
        int c= a+b;
        System.out.print(c + " ");
        a=b;
        b=c;
       }
    } 
  
    public static void main(String[] args) {
        int number = 9;
        fib(number);
    }
}


class Q4{
    public static void swap(int a, int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping: n1= " + a + " n2= " + b);
    }
    public static void main(String [] args){
        int n1= 4;
        int n2= 3;
        System.out.println("Before swapping: n1= " + n1 + " n2= " + n2);
        swap(n1, n2);
        
    }
}


class Q3{
    public static void swap(int a, int b){
        int temp = a;
        a = b; 
        b=temp;
        System.out.println("After swapping: n1= " + a + " n2= " + b);     
    }
    public static void main(String [] args){
        int n1= 8;
        int n2= 5;
        System.out.println("Before swapping: n1= " + n1 + " n2= " + n2);
        swap(n1, n2);
        
    }
}





class Q2{
    public static int factorial(int n){
        int fact=1;
        while(n!=0){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
         int number = 7;
         int fact = factorial(number);
         System.out.println(fact);
    }
}





class Q1{
    public static int factorial(int n){
        int fact=1;
        for(int i=1 ;i<= n; i ++ ){
            fact=fact*i;
        }
        return fact;    
    }
    public static void main(String[] args) {
        int number = 5;
        int fact = factorial(number);
        System.out.println(fact);
    }
}