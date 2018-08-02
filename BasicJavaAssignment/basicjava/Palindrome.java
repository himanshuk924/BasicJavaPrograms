package basicjava;
import java.util.Scanner;
public class Palindrome {
	static void checkPalindrome(String str) {
		StringBuffer temp=new StringBuffer(str);
		temp.reverse().toString();
		if(str.equals(temp.toString())){
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check it is palindrome or not");
		String str=sc.next();
		checkPalindrome(str);
		sc.close();
	}
}
