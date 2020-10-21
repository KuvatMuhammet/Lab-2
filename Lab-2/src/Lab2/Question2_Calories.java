package Lab2;

import java.util.Scanner;

public class Question2_Calories {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of cookies:");
		int numOfCookies = scan.nextInt();

		int calPerCookie = (10 * 300) / 40;
		int numOfTotalCal = numOfCookies * calPerCookie;

		System.out.println("Number of total calories:" + numOfTotalCal);

	}

}
