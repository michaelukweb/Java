//This Program checks to see if an Integer is a Prime Number
public class IsPrime {

	public static void main(String[] args) {
		
		boolean result = isPrime(6);
		System.out.println(result);
		checkprime(13);
		
	}
		//Method to check if number is prime 
	
		public static boolean isPrime (int n)
		{
				
			if (n == 2) 
			{
				return true;
			}
			
			for (int i = 2; i < n; i++) 
			{
				
				if (n % i == 0) 
				{					
					return false;
				}
				
			}
			
			return true;
			 
		}
		
		//Function that Prints out all the prime numbers less than or equal to an integer n 
		
		public static void checkprime(int b){
			
			for (int i = 2; i <= b; i++) 
			{
				if (isPrime(i)) 
				{
					System.out.println(i);
				}
				
			}	
			
		}
	
}
