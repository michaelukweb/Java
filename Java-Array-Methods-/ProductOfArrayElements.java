
public class ProductOfArrayElements {

	public static void main (String [] args)
	{

	    int [] array = {1,2,4};
	    int result = multiplyArray(array);
	    System.out.println(result);

	}
	public static int multiplyArray (int [] array)
	{

	    int total = 1;

	    for (int i = 0; i < array.length; i ++)
	    {

	        total = total * array[i];

	    }
	    return total;
	}

}
