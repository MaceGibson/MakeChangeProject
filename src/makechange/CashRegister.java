package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		 // The user is prompted asking for the price of the item
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the price of the customer's puchase: ");
		double userPrice = kb.nextDouble();
		
		
		 // The user is then prompted asking how much money was tendered by the customer
		
		System.out.println("How much money tendered by customer");
		double customerTender = kb.nextDouble();
		
		//Display an appropriate message if the customer provided too little money or the exact amount
		
		if (userPrice > customerTender) {
			System.out.println("This is not enough to pay for the purchase!!");
		} else if (userPrice == customerTender) {
			System.out.println("This is the exact amount due.");
			System.out.println("Change due: $0.00");
		} else {
			double changeDue = calculateChange(userPrice, customerTender);
			System.out.println("The change due to the customer is: " + changeDue);
			
		}
	}
	/*
	 * If the amount tendered is more than the cost of the item,
	 * display the number of bills and coins that should be given to the customer.
	 */
	
	public static double calculateChange(double price, double tender) {
		double change = tender - price;
		
		return change;
	}

}
