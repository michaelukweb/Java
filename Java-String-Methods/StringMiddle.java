/*Program that prints the middle character of a String or word*/
import java.util.Arrays;

public class StringMiddle
{
    public static void main (String [] args){
    	
    	middle("Hello");//5 letter word prints 'l'
    	middle("Java");//4 letter word print 'av'
    	middle("Hello There");//Two words prints " " blank space as that is middle character

    }

    public static void middle (String text){
    	
        int number = text.length();
        int even = number / 2 - 1;

        //Even Numbers 
        if ( number % 2 == 0) {

            for (int i = even; i < even + 2; i++){

                if (i % even == 0){

                    System.out.print(text.charAt(i));

                } else if (i % even == 1) {

                    System.out.print(text.charAt(i));
                }

            }

        }

        int odd = number / 2 ;

        if (number % 2 == 1){

            for (int i = odd; i <= odd; i++){

                System.out.println(text.charAt(i));
            }
        }
    }

    public static String result (String text){

        int number = text.length();
        int even = number / 2 - 1;

        String s2 = " ";

        //Even Numbers 
        if ( number % 2 == 0) {

            for (int i = even; i < even + 2; i++){

                if (i % even == 0){

                    s2 += text.substring(i,i+1);

                } else if (i % even == 1) {

                    s2 += text.substring(i,i+1);

                }

            }

        }

        int odd = number / 2 ;

        if (number % 2 == 1){

            for (int i = odd; i <= odd; i++){

                s2 += text.substring(i,i+1);

            }
        }

        return s2;
    }

}