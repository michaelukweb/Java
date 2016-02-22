import java.util.Arrays;
//Euclidean Program that returns the norm of a given vector

public class Euclidean {

	public static void main (String [] args){

        //get Euclidean
        double [] array = {0.0,3.0,4.0};
        double result = getEuclideanNorm(array);
        System.out.println("Euclidean Function result: " + result);

        //Normalise function
        double [] test = {0,3,4};
        getNormalised(test);
        System.out.println(Arrays.toString(test));
    }

    public static double getEuclideanNorm(double[] vec)
    {


        double sum =  0;

        for (int i = 0; i < vec.length; i++){

            sum = vec[i] * vec[i] + sum;


        }

        //return sum; returns 25

        double result = Math.sqrt(sum);//returns 5

        return result;

    }

    //Given a non-zero vector this method returns a new normalised vector of vec 
    
    public static double [] getNormalised(double [] vec1){

        double result = getEuclideanNorm(vec1);

        for (int i = 0; i < vec1.length; i++){

            vec1[i] = (vec1[i]) / result;

        }

        return vec1;
    }

}
