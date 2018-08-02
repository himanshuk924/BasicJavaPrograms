package menudriven;

import java.util.Scanner;

public class Temperature {
	Scanner sc = new Scanner(System.in);

	public Temperature() {
		double celsius, res;
		System.out.println("Enter temperature in Celsius to convert into Farenheit");
		celsius = sc.nextDouble();
		//Converting celsius to farenheit
		res = (celsius * 9 / 5) + 32;
		System.out.println(res + "F");
	}
}
