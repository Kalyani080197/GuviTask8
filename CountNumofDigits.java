package task8;

import java.util.Scanner;

public class CountNumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Convert the integer to a string
        String numberAsString = Integer.toString(number);
        
        // Find the length of the string (number of digits)
        int digitCount = numberAsString.length();
        
        System.out.println("Number of digits: " + digitCount);
        
        scanner.close();

	}

}
