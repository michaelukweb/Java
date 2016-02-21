
public class LargestInArray {

	//Static void with no parameters 
	public static void findInt () {

	    int [] array = {5,8,2,1};

	    int temp = 0;

	    for (int i = 0; i < array.length; i++)
	    {
	        if (array[i] > temp)
	        {
	            temp = array[i];
	        }
	    }

	    System.out.println(temp);

	}

	//Static void 
	public static void getNumber (int [] arrays) {

	    int temp = 0;

	    for (int i = 0; i < arrays.length; i++)
	    {
	        if (arrays[i] > temp)
	        {
	            temp = arrays[i];
	        }
	    }

	    System.out.println(temp);

	}

	//Function to return largest value 
	public static int largestInteger (int [] arr)
	{

	    int temp = 0;

	    for (int i = 0; i < arr.length; i++)
	    {
	        if (arr[i] > temp)
	        {
	            temp = arr[i];
	        }
	    }

	    return temp;

	}

}
