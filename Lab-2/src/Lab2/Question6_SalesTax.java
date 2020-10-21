package Lab2;

import java.util.Scanner;

public class Question6_SalesTax {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the amount of a purchase:");
		double amountOfPurchase = scan.nextInt();

		double stateSalesTax = amountOfPurchase * 0.04;
		double countySalesTax = amountOfPurchase * 0.02;
		double totalOfSale = amountOfPurchase + stateSalesTax + countySalesTax;
		System.out.println("The amount of a puchase : $" + amountOfPurchase);
		System.out.println("The state sales tax     : $" + stateSalesTax);
		System.out.println("The county sales tax    : $" + countySalesTax);
		System.out.println("The total sales taxes   : $" + (stateSalesTax + countySalesTax));
		System.out.println("---------------------------------");
		System.out.println("Totla of the sale       : $" + totalOfSale);

	}

}
