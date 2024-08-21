package javapackage;

import java.util.Scanner;

public class DigitCounter{
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt(); // 

        int count = 0;
        
        int temp = Math.abs(number); // Handle negative numbers

        // Loop to count the digits
        do {
            temp /= 10; // Remove the last digit
            count++;    // Increment the count
        } while (temp != 0);

        System.out.println("The number of digits in " + number + " is: " + count);

       
    }
}
