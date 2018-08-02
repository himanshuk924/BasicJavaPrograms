package basicjava;

import java.util.Scanner;

public class User {
	//To check user password is correct or not 
	static void usercheck(String uname,String passw){
		String checkuname,checkpassw;
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(count<3){
		System.out.println("Enter user name");
		checkuname=sc.next();
		System.out.println("Enter user password");
		checkpassw=sc.next();
		if(checkuname.equals(uname)&&checkpassw.equals(passw)){
			System.out.println("Welcome "+uname);
			break;
		}
		else 
		{
			System.out.println("invalid username password");
		}
		if(count==3){
			System.out.println("Contact Admin");
			break;
		}
		count++;
		}
		sc.close();
	}
	public static void main(String[] args) {
		String uname,passw;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		uname=sc.next();
		System.out.println("Enter user password");
		passw=sc.next();
		usercheck(uname,passw);
		sc.close();
	}

}
