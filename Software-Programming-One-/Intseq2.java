/*Program to calculate the Range, Max, Min and average value of to integers 
 * 
 */
import java.util.Scanner;
public class Intseq2 {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter Integer one: ");
		int one = in.nextInt();
		count++;
		System.out.println("Please enter Integer two: ");
		int two = in.nextInt();
		count++;
		System.out.println("Please enter Integer three: ");
		int three = in.nextInt();
		
		int min = 0;
		int max = 0;
		
		if (one > two) {
			
			max = one;
			min = two;
			
		} else if (two > one) {
			
			max = two;
			min = one;
		}
		
		int range = max - min;
		
		System.out.println("Maximum value is: " + max);
		System.out.println("Minimum value is: " + min);
		System.out.println("The numer of values entered is: " + count);
		System.out.println("The average is " + (min+max)/count);
		System.out.println("The range is "+range );
		
		
		
		
	}

}
