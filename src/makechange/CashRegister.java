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

		// Display an appropriate message if the customer provided too little money or
		// the exact amount

		if (userPrice > customerTender) {
			System.out.println("This is not enough to pay for the purchase!!");
		} else if (userPrice == customerTender) {
			System.out.println("This is the exact amount due.");
			System.out.println("Change due: $0.00");
		} else {
			calculateChange(userPrice, customerTender);
		}
	}
	/*
	 * If the amount tendered is more than the cost of the item, display the number
	 * of bills and coins that should be given to the customer.
	 */

	public static double calculateChange(double price, double tender) {
		double change = tender - price;

		// change to int for whole number calculations
		int changeInCents = (int)(change * 100);

		// now we need to provide bills in cents for the program example: 2000c is equal
		// to $20 bill
		int[] centsToBills = { 2000, 1000, 500, 100, 25, 10, 5, 1 };

		// below we calculate the number of bills needed for each denomination in us
		// currency

		// 20s
		int twenties = changeInCents / centsToBills[0];
		changeInCents %= centsToBills[0];

		// 10s
		int tens = changeInCents / centsToBills[1];
		changeInCents %= centsToBills[1];

		// 5s
		int fives = changeInCents / centsToBills[2];
		changeInCents %= centsToBills[2];

		// 1s
		int ones = changeInCents / centsToBills[3];
		changeInCents %= centsToBills[3];

		// 25c
		int quarters = changeInCents / centsToBills[4];
		changeInCents %= centsToBills[4];

		// 10c
		int dimes = changeInCents / centsToBills[5];
		changeInCents %= centsToBills[5];

		// 5c
		int nickels = changeInCents / centsToBills[6];
		changeInCents %= centsToBills[6];

		System.out.println("Debug - changeInCents: " + changeInCents);
		int pennies = changeInCents;
		System.out.println("Debug - pennies: " + pennies);

		// 1c
		//int pennies = changeInCents;

		// Display the change amount
		System.out.println("The change due to the customer is:");

		// 20s
		if (twenties > 0)
			System.out.println(twenties + " x $20 bills");

		// 10s
		if (tens > 0)
			System.out.println(tens + " x $10 bills");

		// 5s
		if (fives > 0)
			System.out.println(fives + " x $5 bills");

		// 1s
		if (ones > 0)
			System.out.println(ones + " x $1 bills");

		// 25c
		if (quarters > 0)
			System.out.println(quarters + " x quarters");

		// 10c
		if (dimes > 0)
			System.out.println(dimes + " x dimes");

		// 5c
		if (nickels > 0)
			System.out.println(nickels + " x nickels");

		// 1c
		if (pennies > 0)
			System.out.println(pennies + " x pennies");

		return change;
	}

}
