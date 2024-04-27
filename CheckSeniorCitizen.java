package task8;

import java.util.Scanner;

public class CheckSeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }
        
        scanner.close();
	}

}
