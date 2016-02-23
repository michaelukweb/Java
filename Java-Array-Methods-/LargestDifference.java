public class LargestDifference {

	public static void main(String[] args) {
		
		int [] result = {0,2,6,1};
		largestDiff(result);
	}
	
	public static int largestDiff(int [] value ){
		
		int maxDiff = 0;
		int minDiff = 0;
		int diff = 0;
		
		int [] values = {0,2,6,1};
		
		if (values.length <  2) {
			
			return 0;
		} 
		
		for (int i = 1; i < values.length; i++) {
			
			diff = values[i-1] - values[i];
			
			if (diff < 0) {
				diff = - diff;
			}
			
			if (diff > maxDiff) {
				
				maxDiff = diff;
			}
			
		}
		//System.out.println(maxDiff);
		return maxDiff;
	}

}
