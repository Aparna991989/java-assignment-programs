package javapackage;

import java.util.Scanner;

public class SwappingOfNumbers {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
	 
	 System.out.println("enter the value a:");
	 
	 
	 
	 int a = sc.nextInt();
	 		
	 		System.out.println("enter the value b:");
	 		
	 		 		int b = sc.nextInt();
	 		 		
	 		 		int c;
	 
	
	 		 		c=a;
	 		 		a=b;
	 		 		b=c;
	
	 
	 System.out.println("After swapping a:" +a+ " and b:" +b  );
	 
	 
}
}
