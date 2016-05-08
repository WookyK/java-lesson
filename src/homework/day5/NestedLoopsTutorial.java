package homework.day5;

import java.util.Scanner;

public class NestedLoopsTutorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int width = in.nextInt();
		String r = "";
		for (int i = 1; i <= width; i++)
		{
			for (int j = 1; j <= i; j++)
				r = r + "[]";
			r = r + "\n";
		}
		System.out.println(r);
	}

}
