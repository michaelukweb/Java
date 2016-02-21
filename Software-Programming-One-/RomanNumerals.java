import java.util.Scanner;
public class RomanNumerals
{
    public static void main (String [] args)
    {
    	// I = 1, V = 5, X = 10, L = 50, C = 100
    	
        String romanUnits = romanDigit(70 % 10, "I", "V", "X");
        int n = 70 / 10;
        
        //Testing return Method Roman Numerals
        System.out.println(RomanNumerals.conversion(1978));
        
        //Testing IntegerToRoman Method
        System.out.println("unit test " + RomanNumerals.integerToRoman(1978));
       
        
    }
    
    //Program to convert an Integer to Roman numerals 
    public static String conversion(int number){

        String Roman = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number between 1-3999");
        int n = in.nextInt();

        if (n >= 1 && n <= 3999) {

            int digit = n / 1000;
            int thousand = (n / 1000);
            int hundred = (n % 1000) / 100;
            int ten = (n % 100) / 10;
            int unit = (n % 10) / 1;

            //Converts Thousand 
            if (digit == 3) {

                Roman += "MMM";
            } else if (digit == 2){

                Roman += "MM";
            } else if (digit == 1){

                Roman += "M";
            }

            // Converts the hundreds 

            if (hundred == 1) {

                Roman += "C";

            } else if (hundred == 2) {

                Roman += "CC";

            } else if (hundred == 3) {

                Roman += "CCC";
            } else if (hundred == 4) {

                Roman += "CD";
            } else if (hundred == 5) {

                Roman += "D";
            } else if (hundred == 6) {

                Roman += "DC";
            } else if (hundred == 7) {

                Roman += "DCC";
            } else if (hundred == 8) {

                Roman += "DCCC";
            } else {

                Roman += "CM";
            }

            // Convert Tens - X = 10, L = 50
            if (ten == 1 ) {

                Roman += "X";
            } else if (ten == 2) {

                Roman += "XX";
            } else if (ten == 3) {

                Roman += "XXX";
            } else if (ten == 4) {

                Roman += "LX";
            } else if (ten == 5) {

                Roman += "L";
            } else if (ten == 6) {

                Roman += "LX";
            } else if (ten == 7) {

                Roman += "LXX";

            } else if (ten == 8) {

                Roman += "LXXX";
            } else {

                Roman += "XC";
            }

            //Converts the units, I = 1 , V = 5

            if (unit == 1) {

                Roman += "I";
            } else if (unit == 2) {

                Roman += "II";
            } else if (unit == 3) {

                Roman += "III";
            } else if (unit == 4) {

                Roman += "IV";
            } else if (unit == 5) {

                Roman += "V";
            } else if (unit == 6) {

                Roman += "VI";
            } else if (unit == 7) {

                Roman += "VII";
            } else if (unit == 8) {

                Roman += "VIII";
            } else {

                Roman += "IX";
            }

        } else {

            System.out.println("Error - Please Enter a digit between 1 - 3999");
        }

    
        return Roman;
    }

    public static String romanDigit(int n, String one, String five, String ten){
        
        String Roman = "";
        
        if (n == 1) {
            return one;
        } else if (n == 2) {
            return one + one;
        } else if (n == 3) {
            return one + one + one;
        } else if (n == 4) {
            return one + five;
        } else if (n == 5) {
            return five;
        } else if (n == 6) {
            return five + one;
        } else if (n == 7) {
            return five + one + one;
        } else if (n == 8) {
            return five + one + one + one;
        } else {
            return one + ten;
        }

    }
    
    // I = 1, V = 5, X = 10, L = 50, C = 100
    public static String integerToRoman(int number) {
        String ones = romanDigit(number % 10, "I", "V", "X");
        number /= 10;
        String tens = romanDigit(number % 10, "X", "L", "C");
        number /= 10;
        String hundreds = romanDigit(number % 10, "C", "D", "M");
        number /= 10;
        String thousands = romanDigit(number % 10, "M", "M", "M");
        number /= 10;
        return thousands + hundreds + tens + ones;
    }
}

