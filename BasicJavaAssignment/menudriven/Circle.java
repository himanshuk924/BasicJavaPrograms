package menudriven;

import java.util.Scanner;

public class Circle {
	final double pi = 3.14;
	//TO CALCULATE CIRCLE AREA
	double area(int r) {
		return pi * r * r;
	}
	//TO CALCULATE CIRCLE PERIMETER
	double perimeter(int r) {
		return 2 * (pi * r);
	}

	Scanner sc = new Scanner(System.in);

	public Circle() {
		System.out.println("Enter the radius");
		int r;
		r = sc.nextInt();
		System.out.println("Area will be " + area(r) + " Perimeter will be " + perimeter(r));

	}
}
