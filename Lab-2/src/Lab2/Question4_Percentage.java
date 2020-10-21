package Lab2;

import java.util.Scanner;

public class Question4_Percentage {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of males in a class:");
		int numMales = scan.nextInt();
		System.out.print("Enter the number of females in a class:");
		int numFemales = scan.nextInt();

		double total = numMales + numFemales;
		double perOfMales = numMales * 100 / total;
		double perOfFemales = numFemales * 100 / total;

		System.out.println("----------------------------------------");
		System.out.println("Percentage of males in the class: " + perOfMales + " %");
		System.out.println("Percentage of males in the class: " + perOfFemales + " %");

	}

}
