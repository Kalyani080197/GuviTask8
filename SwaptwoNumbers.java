package task8;

public class SwaptwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
        int num2 = 10;

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swap the numbers using a third variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
		}

}
