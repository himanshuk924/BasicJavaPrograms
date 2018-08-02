package basicjava;
import java.util.Scanner;
public class NameInNames {
	static void findName(String names[],String str) {
		int count=0;
		for(int i=0;i<names.length;i++) {
			if(str.equals(names[i])) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(str+" Name not found");
		}
		else
			System.out.println(str+" Name and Number of occurance are "+ count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of names");
		int n=sc.nextInt();
		System.out.println("Enter names");
		String []names=new String[n];
		for(int i=0;i<n;i++) {
			names[i]=sc.next();
		}
		System.out.println("Enter name to find and number of its occurance");
		String str=sc.next();
		findName(names,str);
		sc.close();
	}

}
