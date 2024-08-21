package javapackage;
import java.util.Scanner;
public class SumOfTwoIntegers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
	 
	 System.out.println("enter the value a:");
	 int a = sc.nextInt();
	 		
	 		System.out.println("enter the value b:");
	 		
	 		 		int b = sc.nextInt();
	 		 		System.out.println("enter the value c:");
	 		 		 		int  c= sc.nextInt();
	 		 		 		
	 		 		 		System.out.println("enter the value d:");
	 		 		 		 		int d = sc.nextInt();
	 if(a+b > c+d )
	 {
	 
	 System.out.println("sum of a & b is greater than c & d");
	 
	 }
		 else
		 {
		 
		 System.out.println("sum of a & b is not greater than c & d");
		 }
	}

}
