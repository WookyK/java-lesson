package homework.day5;

import java.util.Scanner;

public class FibonacciRunner {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	//if u want to make a code with input write this line
		System.out.println("Enter n:");
		int n = in.nextInt();	//reads the inputted "integer"
		FibonacciGenerator fg = new FibonacciGenerator();

		for (int i = 1; i <= n; i++)
		{
			System.out.println(fg.nextNumber());
		}	
	}
}
