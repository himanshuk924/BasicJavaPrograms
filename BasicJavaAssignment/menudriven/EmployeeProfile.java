package menudriven;
import java.util.Scanner;
public class EmployeeProfile {
Scanner sc=new Scanner(System.in);
public EmployeeProfile() {
	String name;
	String profile;
	int  experience;
	double salary;
	System.out.println("Enter employee name");
	name=sc.next();
	System.out.println("Enter employee profile");
	profile=sc.next();
	System.out.println("Enter employee experience");
	experience=sc.nextInt();
	System.out.println("Enter employee salary");
	salary=sc.nextDouble();
	System.out.println("Complete details of employee is");
	System.out.println("Name: "+name);
	System.out.println("Profile: "+profile);
	System.out.println("Experience: "+experience);
	System.out.println("Salary: "+salary);
	
	
}
}
