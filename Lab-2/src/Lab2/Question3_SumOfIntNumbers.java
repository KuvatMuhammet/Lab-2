package Lab2;

import java.util.Scanner;

public class Question3_SumOfIntNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a positive nonzero integer value:");
		int num = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = sum + i;

		}
		System.out.println("Sum = " + sum);

	}

}
