
public class SmallestInArray {

	public static void main (String [] args) {

		   findSmallest();

		   int [] array = {1,2,4,56,7};
		   int result = findSmallest(array);
		   System.out.println(result);

		   getSmallest(array);

		}
		// Function to return smallest value in array

		public static int findSmallest (int [] array) {

		   int smallest = array[0];

		   for (int i = 0; i < array.length; i++)
		   {
		       if (smallest <= array[i])
		       {
		           smallest = array[i];
		       }
		   }

		   return smallest;
		}

		// Public void with no paramaters

		public static void findSmallest () { int [] array = {7,4,64,79,3,8};

		   int smallest = array[0];//set variable to array index 0

		   for (int i = 0; i < array.length; i++)
		   {
		       if (array[i] <= smallest)
		       {
		           smallest = array[i];
		       }
		   }

		   System.out.println(smallest);
		}

		//public void function

		public static void getSmallest (int [] array) { int smallest = array[0];

		   for (int i = 0; i < array.length; i++)
		   { 

		       if (smallest <= array[i])
		       {
		           smallest = array[i];

		       }

		   }

		   System.out.println(smallest);
		}

}
