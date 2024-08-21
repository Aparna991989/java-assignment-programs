package javapackage;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		 
		 System.out.println("enter the value a:");
		 int a = sc.nextInt();
		 		
		 		
		 if(a % 2 == 0)
			 //% symbol checks the remainder 
		 {
		 
		 System.out.println(a+" is an even number");
		 
		 }
			 else
			 {
			 
			 System.out.println(a+" is not  an even number");
			 }
		}


	}


