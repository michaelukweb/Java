/*program that returns the sum of an integers divisors 
 * i.e Integer 10 returns 8 because (5+2+1 = 8)
 * */
import java.util.Scanner;
public class SumOfDivisors {

	public static void main(String[] args) {
	
	//Function call to SumOfDivisors Method
	SumOfDivisors one = new SumOfDivisors();
	System.out.println("The divisor method returns " + one.divisors(10));

	}
	
	public int divisors (int n){
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a Integer");
		int num = in.nextInt();
		int sum = 0;
		
		for (int i = 1; i < num; i++) {
			
			if (num % i == 0) {
				
				sum += i;
				System.out.println(i);
				
			}
			
		}
		System.out.println("The total sum is: " + sum);
		
		return sum;
	}
	
	

}
