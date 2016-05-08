package homework.day5;

import java.util.Scanner;

public class ComputingATotal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double total = 0;
		while (in.hasNextDouble())
		{
			double input = in.nextDouble();
			total = total + input;
			System.out.println(total);
		}
	}
}
