import java.util.Scanner;
class twoa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int rows = sc.nextInt();
        for(int i=1; i <= rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");  
            }
            System.out.println();
        }
    sc.close();
    }


}

class twob{
    public static void main(String[] args){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc1.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        sc1.close();
       
    }
}

class twoc{
    public static void main(String[] args){
       int [] arr = {1,2,3,4,5};
       int [] revarr = new int[arr.length];
       for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
       }
       int index =0;
         for(int i=arr.length-1; i>=0; i--){
            revarr[index] = arr[i];
            index++;
            }
        System.out.println();
        for(int i=0; i<revarr.length; i++){
            System.out.print(revarr[i] + " ");
        }

       
    
    }
}

