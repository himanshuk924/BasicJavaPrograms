package menudriven;
import java.util.Scanner;
public class CustomerAddress {
	Scanner sc=new Scanner(System.in);
public CustomerAddress() {
	String name;
	String address;
	int pincode;
	System.out.println("Enter Customer Name");
	name=sc.next();
	System.out.println("Enter Customer Address");
	address=sc.next();
	System.out.println("Enter Customer Pincode");
	pincode=sc.nextInt();
	System.out.println("Complete info of Customer is");
	System.out.println("Name is "+name+" address "+address+" pincode "+pincode);
}
}
