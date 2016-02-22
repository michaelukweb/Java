/* Program takes in an array, squares each element of the array
 * adds it to the sum and returns the quadratic mean 
 */
public class QuadraticMean {

	public static void main(String[] args) {
		
		int [] array = {1,1,2,5,7};
		quadMean(array);

	}

	public static double quadMean(int [] arr){
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = arr[i] * arr[i];
			sum += arr[i];
			System.out.println(arr[i]);
			
		}
		
		//System.out.println("The sum is: " + Math.sqrt(sum/arr.length));
		return Math.sqrt(sum/arr.length);
	}
}
