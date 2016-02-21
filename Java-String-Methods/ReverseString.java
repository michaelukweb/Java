import java.util.Scanner;
public class ReverseString {

	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a word\n");
		String word = in.nextLine();
		
		
		for (int i = word.length()-1; i >= 0; i--) {
			
			System.out.print(word.charAt(i) + " ");
			
		}
		
		
		
	}
	
	
}
