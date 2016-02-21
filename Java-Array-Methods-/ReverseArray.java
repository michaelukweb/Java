import java.util.Arrays;

public class ReverseArray {


	public static void main (String [] args)
	{
	    int [] array = {1,2,3,4};

	    for (int i = array.length - 1; i >=0; i--)
	    {
	        System.out.print(i + " ");

	    }

	    int [] arr = {10,20,30};
	    reverse(arr);

	}

	public static void reverse (int [ ] array)
	{

	    int x = array.length;

	    int [] newArray = new int [x];

	    int pos = 0;

	    for (int i = array.length - 1; i >=0; i--)
	    {
	        newArray[pos] = array[i];
	        pos++;

	    }

	    System.out.println(Arrays.toString(newArray));    
	}
}
