package homework.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chapter4 {
	public Chapter4() {
		
	}
	
	public float foo(int width, int length) {
		final int TRIANGLE_AREA_BLAH = 2;
		return width * length / TRIANGLE_AREA_BLAH;
	}
	
	public void getParameters() {
		Scanner scanner = new Scanner(System.in);
		String keyIn = scanner.nextLine();
		System.out.println(keyIn);
	}

	public void getParametersOfBlah() {
//		Make a code that will allow to input certain numbers to the variables
		System.out.println("please input coeffs =>");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		String c = scanner.nextLine();
		System.out.printf("%s %s %s\n", a, b, c);
		System.out.println(a + "," + b + "," + c);

//		Write quadratic function
		System.out.println("equation:" + a + "x^2 +" + b + "x + " + c);
//		Set a code to see the out put
		List<Double> solutions = 
				solveQuadraticEquation(Integer.parseInt(a), Integer.parseInt(b), Integer.parseInt(c));	
		System.out.println(solutions.get(0) + "," + solutions.get(1));
	}
	
	
	public List<Double> solveQuadraticEquation(int a, int b, int c) {
		List<Double> solutions = new ArrayList<>();
		double left = (double)-b / 2*a;
		double right = 0;
		System.out.println("left = " + left);
		if ( (b*b - 4*a*c) >= 0 ) { 
			double t = b*b - 4*a*c;
			System.out.println("t:" + t);
			double sqrted = Math.sqrt(t);
			System.out.println("sqrted:" + sqrted);			
			right = sqrted / 2*a;	
		} else {
			// DO SOMETHING
		}
	
		System.out.println("right = " + right);
		
		double x1 = left + right;
		double x2 = left - right;
		
		solutions.add(x1);
		solutions.add(x2);
		
		return solutions;
	}
}
