import java.util.Scanner;
public class TestCashRegister {

	public static void main(String[] args) {
		
		CashRegister two = new CashRegister();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the price of the item");
		int input = in.nextInt();
		two.addItem(input);
		two.getItemPrice(input);
		System.out.print((two.getCount() == 1) ? "OK" : "fail");

		

	}

}
