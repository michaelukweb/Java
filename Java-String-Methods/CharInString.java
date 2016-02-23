import java.util.Scanner;
//Method that calculates the number of whitespaces in a string 
public class CharInString {
	
	public static void main (String [] args) {
		
		
		whiteSpace("Hi there today ");
			
	}
	
	public static void whiteSpace(String s) {
		
		int a = s.length();
		int space = 0;
		
		for (int i = 0; i < a; i++) {
			
			
			if (Character.isWhitespace(s.charAt(i)) == true) {
				 
				space++;
			}
			
			//if (s.charAt(i) == ' ') {
			//a--;
				
		}
		
		System.out.println("The number of whitespaces in this String is " + space);
	}

}

