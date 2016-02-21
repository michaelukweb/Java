import java.util.Scanner;
public class SpaceDigitP216 {
	
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a 5 digit number: ");
		int x = in.nextInt();
		String s = new Integer(x).toString();
		int len = s.length();
		
		if (s.length() < 6) {
		
		
			for (int i = 0; i < s.length(); i++) {
				
				System.out.print(s.charAt(i)+ " ");
				
			}
		} else {
			
			System.out.println("Error please enter a five digit number");
		}
		
		
	}
	
	public void even() {
		
		 Scanner input = new Scanner(System.in);
	        System.out.print("Five-digit number: ");
	        int number = input.nextInt();
	        input.close();
	        int digit_a = number % 10; 
	        number /= 10;
	        int digit_b = number % 10;
	        number /= 10;
	        int digit_c = number % 10;
	        number /= 10;
	        int digit_d = number % 10;
	        int digit_e = number /  10;
	        System.out.printf("%d %d %d %d %d", digit_e, digit_d, digit_c, digit_b, digit_a);
		
	}
	
	

}
