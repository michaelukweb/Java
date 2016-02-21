
import java.util.Scanner;
public class CashRegister {
	
	public int itemCount;
	public double total;
	double itemPrice;
	

	public static void main(String[] args) {
		
		CashRegister one = new CashRegister();
		
		//Scanner object to input price 
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the price of your item: ");
		double input = in.nextDouble();
		one.addItem(input);
		
		one.addItem(4.08);
		one.addItem(7.09);
		System.out.println("The total amout is "+one.getTotal());
		
		//deduction on price minus
		one.minus(3.00);
		System.out.println("Cash register with minus " + one.getTotal());
		
		//Percentage 20% off
		one.discount(20);
		System.out.println("Cash register total after discount is: " + one.getTotal());
		
		//Number of items 
		System.out.println("Number of items bought is : " + one.getCount());
		
		//Remove an item 
		one.removeitem(2);
		System.out.println("After removing 2 items the item count is: " + one.getCount());
		
		//Clears cash register
		one.clear();
		System.out.println("Cash register is clear at: " + one.getTotal());
		
		
		
		
	}
	
	//Clears the cash register 
	public void clear(){
		
		itemCount = 0;
		total = 0;
	}
	
	//setter add item
	public void addItem(double itemPrice){
		
		itemCount++;
		total  += itemPrice;
		
	}
	
	//Getter returns item price 
	public double getItemPrice(double price){
		
		total += price;
		return price;
		
	}
	
	//Getter returns total
	public double getTotal(){
		
		return total;
	}
	
	//Minus Price
	public void minus (double minusPrice) {
		
		total -= minusPrice;
		
	}
	
	//Percentage discount 
	public void discount(double percentage) {
		
		double result = (total / 100) * percentage;
		total -= result;
		
	}
	
	//Return item count 
	public int getCount (){
		
		return itemCount;
	}
	
	//Remove items 
	public void removeitem(int itemsRemoved){
		
		itemCount -= itemsRemoved;
	}

}
