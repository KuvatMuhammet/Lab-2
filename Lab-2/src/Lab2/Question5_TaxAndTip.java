package Lab2;

import java.util.Scanner;

public class Question5_TaxAndTip {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the charge of the meal:");
		double chargeOfMeal = scan.nextInt();

		double tax = (chargeOfMeal * 6.75) / 100;
		double tip = (chargeOfMeal + tax) * 0.2;
		double totalBill = chargeOfMeal + tax + tip;

		System.out.println("Charge of the meal: $" + chargeOfMeal);
		System.out.println("Tax amount        : $" + tax);
		System.out.println("Tip amount        : $" + tip);
		System.out.println("---------------------------");
		System.out.println("Your total bill   : $" + totalBill);

	}

}
