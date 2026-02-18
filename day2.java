import java.util.Scanner;
class day2{
	public static void main(String [] args){
		double l, b, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		l=sc.nextDouble();
		System.out.print("Enter breadth: ");
		b=sc.nextDouble();
		a=l*b;
		System.out.println("Area = " + a );
		sc.close();
}
}
		
		