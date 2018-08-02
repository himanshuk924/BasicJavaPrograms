package menudriven;

import java.util.Scanner;

class Rectangle {
	//To calculate the area of the rectangle
	int area(int len, int bre) {
		return len * bre;                                                                             
	}
	//To calculate the perimeter of the rectangle
	int perimeter(int len, int bre) {
		return 2 * (len + bre);
	}

	Scanner sc = new Scanner(System.in);

	public Rectangle() {
		System.out.println("Enter length and width");
		int length, width;
		length = sc.nextInt();
		width = sc.nextInt();
		System.out.println("Area will be " + area(length, width) + " Perimeter will be " + perimeter(length, width));

	}
}