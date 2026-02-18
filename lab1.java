import java.util.Scanner;
class oneb{
    public static void main(String [] args){
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");   
        age = scanner.nextInt();
        if(age>=18){  
            System.out.println("You are eligible to vote.");    
    }else{
        System.out.println("You are not eligible to vote.");
    }
}
}



class onec{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}







class oned{
    public static void main(String [] args){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num= scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;  
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            case 7: 
                System.out.println("Sunday");
                break;
            
            default:
                System.out.println("Invalid number");
        }
    
        scanner.close();
    }

}