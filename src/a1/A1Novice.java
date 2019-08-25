package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// for loop will run for the number of times of the first integer in input (number of customers)
		for (int c = scan.nextInt(); c > 0; c--) {
				char firstInitial = scan.next().charAt(0);
				String lastName = scan.next();
				int totalItems = scan.nextInt();
				double totalPrice = 0.0;
				
				// Adds up total price per customer
				for (int d = totalItems; d > 0; d--) {
					int numberOfItems = scan.nextInt();
					String itemName = scan.next();
					double itemPrice = scan.nextDouble();
					totalPrice += numberOfItems * itemPrice;
				}
				
				// Prints out per each customer (still within for loop)
				System.out.println(firstInitial + ". " + lastName + ": " + totalPrice);
		}
		
		scan.close();
	}
}
