package menudriven;
import java.util.Scanner;
public class Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Menu");
		System.out.println("choose one of them");
		System.out.println("1-for calculator");
		System.out.println("2-for functionality of rectangle");
		System.out.println("3-for functionality of circle");
		System.out.println("4-for chainging date format");
		System.out.println("5-for chainging temperature from celsius to farenheit");
		System.out.println("6-for customer details and address address");
		System.out.println("7-for employee details");
		int n=sc.nextInt();
		switch(n){
			case 1: 
				Calculator calc=new Calculator();//Instantiate calculator
				break;
			case 2: 
				Rectangle rec=new Rectangle();//Instantiate Rectangle
				break;
			case 3:
				Circle c=new Circle();//Instantiate Circle
				break;
			case 4:
				DateC dconv=new DateC();//Instantiate Date
				break;
			case 5:
				Temperature tem=new Temperature();//Instantiate Temperature
				break;
			case 6:
				CustomerAddress cad=new CustomerAddress();//Instantiate CustomerAddress
				break;
			case 7:
				EmployeeProfile emp=new EmployeeProfile();//Instantiate EmployeeProfile
				break;
		}
	}

}
