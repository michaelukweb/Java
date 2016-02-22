/* Returns the difference between the largest and smallest elements
 * of an array. i.e 3 + -2 returns 5 as (max - min) = 3 + - -2 = 5
 */
public class Diameter {

	public static void main(String[] args) {
	
		int [] result  = {0, 1, -2, 3};
		diameter(result);
		
	}
	
	public static double diameter (int [] a) {
		
		int min = a[0];
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] > max ) {
				
				max = a[i];
				
			} else {
				
				min = a[i];
			}
			
		}
		
		System.out.println(max - min);
		return max - min;
		
		
	}

}
