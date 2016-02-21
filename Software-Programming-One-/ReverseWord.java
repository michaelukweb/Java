import java.util.Scanner;
public class ReverseWord {

	public static void main(String[] args) {
		
		reverseString();

	}
	
	public static void reverseString()  {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String s = in.nextLine();
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.print(s.charAt(i)+ " ");
			
		}
		
		
	}

}
