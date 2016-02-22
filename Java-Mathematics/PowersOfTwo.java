//1.Program to calculate the powers of two up to 20 
//2.Fibonacci Numbers Program
import java.util.Scanner;
public class PowersOfTwo {
	
	public static void main (String [] args){
		
		System.out.println("The powers of two program");
		
		int num = 1; 
		
		for (int i = 0; i < 20; i++){
			
			num = num * 2;
			System.out.println(num);
			System.out.println("The result of 2 to the power of " + i + " is " + (int)(Math.pow(2,i)));
			
			
		}
		
		factorial(9);
		
		
		
	}
	
	public static int factorial (int n) {
		
		if (n == 1 || n == 2){
			
			return 1;
		}
		
		int fibonacci= 1;
		int fib1 =1;
		int fib2=1;
		
		for (int i = 3; i <= n; i++) {
			
		fibonacci = fib1 + fib2;
	    fib1 = fib2;
	    fib2 = fibonacci;
	    
		}
		System.out.println("\nThe result of fibonacci is: " + fibonacci);
		
		return fibonacci;
		
	}
	
	

}
