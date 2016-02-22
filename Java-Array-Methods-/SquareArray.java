import java.util.Arrays;
//Program that square each element of an array
public class SquareArray {

	public static void main(String[] args) {
		
		SquareArray one = new SquareArray();
		
		double [] b = {0,1,2,3};
		System.out.println(Arrays.toString(one.square(b)));

	}
	
	public static double [] square (double [] a){
		
		double []arr = new double[a.length];
		
		for (int i = 0; i < a.length; i++) {
			
			arr[i] = a[i] * a[i];
			
		}
		
		//System.out.println(Arrays.toString(arr));
		return arr;
		
	}

}
