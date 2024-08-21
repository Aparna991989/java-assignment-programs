package javapackage;

import java.util.Scanner;

public class PrimeChecker{
	
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	System.out.println("enter a number: ");
	   int number =sc.nextInt(); 
    boolean isPrime = true;
     if (number <= 1) {
    	  isPrime = false; // Numbers less than or equal to 1 are not prime
          } 
     else {
    	 
         // Check if number is divisible by any number other than 1 and itself
 for (int i = 2; i <= Math.sqrt(number); i++) {
             if (number % i == 0) {
            	 
            isPrime = false;
               break;
        }
           }
        }
     
    if(isPrime)
    	 {
             System.out.println(number + " is a prime number.");
     } 
     
     else
     {

         System.out.println(number + " is not a prime number.");

     } }
}

	
	
	
	
	
	
	
	
	
	
