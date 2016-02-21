import java.util.Arrays;
public class Splice {
	
	public static void main (String [] args)
	{

	    insertInArray();

	}

	public static void insertInArray () {

	    int [] arrayFirst = {1,3,5};
	    int [] arraySecond = {2,4,6};
	    int [] result = new int [6];

	    int pos = 0;
	    int pos2 = 1;

	    for (int i = 0; i < arrayFirst.length; i++)
	    {

	        result[pos] = arrayFirst[i]; 
	        pos = pos + 2;

	    }

	    for (int i = 0; i < arraySecond.length; i++)
	    {

	        result[pos2] = arraySecond[i]; 
	        pos2 = pos2 + 2;

	    }

	    System.out.println(Arrays.toString(result));
	}

}
