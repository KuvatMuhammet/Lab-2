package Lab2;

import java.util.Scanner;

public class Question1_LargestAndSmallestNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first number:");
		int num1 = scan.nextInt();

		System.out.print("Enter your next number:");
		int num2 = scan.nextInt();

		System.out.print("Do you want to enter another number? 0 - No, 1 - Yes");
		int yes0 = scan.nextInt();
		System.out.print("Enter your next number:");
		int num3 = scan.nextInt();

		System.out.print("Do you want to enter another number? 0 - No, 1 - Yes");
		int yes1 = scan.nextInt();
		System.out.print("Enter your next number:");
		int num4 = scan.nextInt();

		System.out.print("Do you want to enter another number? 0 - No, 1 - Yes");
		int yes2 = scan.nextInt();
		System.out.print("Enter your next number:");
		int num5 = scan.nextInt();

		System.out.print("Do you want to enter another number? 0 - No, 1 - Yes");
		int yes3 = scan.nextInt();
		System.out.print("Enter your next number:");
		int num6 = scan.nextInt();

		System.out.print("Do you want to enter another number? 0 - No, 1 - Yes");
		int no = scan.nextInt();

		if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5 && num1 < num6) {
			System.out.println("Smallest number is: " + num1);

		} else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5 && num2 < num6) {
			System.out.println("Smallest number is: " + num2);

		} else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5 && num3 < num6) {
			System.out.println("Smallest number is: " + num3);

		} else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num6) {
			System.out.println("Smallest number is: " + num4);

		} else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num6) {
			System.out.println("Smallest number is: " + num5);

		} else if (num6 < num1 && num6 < num2 && num6 < num3 && num6 < num4 && num6 < num5) {
			System.out.println("Smallest number is: " + num6);

		}

		if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6) {
			System.out.println("Largest number is: " + num1);

		} else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6) {
			System.out.println("Largest number is: " + num2);

		} else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6) {
			System.out.println("Largest number is: " + num3);

		} else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6) {
			System.out.println("Largest number is: " + num4);

		} else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6) {
			System.out.println("Largest number is: " + num5);

		} else if (num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4 && num6 > num5) {
			System.out.println("Largest number is: " + num6);

		}

	}

}
