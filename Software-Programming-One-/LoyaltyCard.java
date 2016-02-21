public class LoyaltyCard {

	private String cardNumber = "";
    private double currentBalance = 0; 
    private int numberOfCoffees = 0;
    static public int customerID = 0; 

    public static void main (String [] args){

        //Creating Customer number 1 - Parameters are Card Number, Coffees bought and amount spent 
        LoyaltyCard customer1 = new LoyaltyCard("1001",10,10.25);

        //Print customer details
        customer1.printing();

        //returns card number for a given customer (void method)
        customer1.getCardNumber();

        //Checks if a free coffee is availible
        customer1.isFreeCoffeeAvailible();

        //Amount spent on card and number of coffees bought
        customer1.collectRewards(10.25,10);

        //Reedem free coffee and update card details 
        customer1.redeemFreeCoffee();

    }

    public LoyaltyCard (String cardNumber, int numberOfCoffees, double balance){

        this.numberOfCoffees = numberOfCoffees;
        this.cardNumber = cardNumber;
        this.currentBalance = balance;
        this.cardNumber = cardNumber;
        customerID++;

    }

    //Get card number
    public void getCardNumber(){
        System.out.println(cardNumber);
    }

    //Get Balance
    public double getBalance(){

        return currentBalance;
    }

    public void collectRewards(double amount, int coffee){

        numberOfCoffees = coffee;
        numberOfCoffees +=1;

        double points = 0;

        if (amount >= 1){

            points = amount / 1;

        }

        if (points >= 1){

            for (int i = 0; i <= points; i++){

                currentBalance += + 1;

            }
        }
        System.out.println("The updated current balance is " + currentBalance);
        System.out.println("The amount of coffees bought are " + coffee);

    }

    public boolean isFreeCoffeeAvailible(){

        if (numberOfCoffees >= 9) {

            System.out.println("Free Coffee is availible " + true);
            return true;
        }
        else {
            System.out.println("No free Coffee yet " + false);
            return false;
        }

    }

    public boolean redeemFreeCoffee(){

        if (numberOfCoffees >= 9){

            numberOfCoffees -= 9;
            System.out.println("The new value of Number of Coffees bought after redeeming offer is: " + numberOfCoffees);
            return true;

        }
        else {

            return false;
        }

    }

    public void printing(){

        System.out.println("Customer with the ID of: " + customerID + " and card number " + cardNumber + " has bought " + numberOfCoffees  + " coffees " + " and current balance is: " + currentBalance);

    }
}
