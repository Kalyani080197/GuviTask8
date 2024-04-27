package task8;

public class PrintAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char start = 'a';
        char end = 'z';
        
        System.out.println("Alphabet from a to z:");
        for(char ch = start; ch <= end; ch++) {
            System.out.print(ch + " ");
        }

	}

}
