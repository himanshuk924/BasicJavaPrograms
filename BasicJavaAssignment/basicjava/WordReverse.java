package basicjava;
import java.util.Scanner;
public class WordReverse {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String []arr=str.split(" ");
	for(int i=0;i<arr.length;i++) {
		StringBuffer rev=new StringBuffer(arr[i]);
		arr[i]=rev.reverse().toString();
		System.out.print(arr[i]+" ");
		sc.close();
	}
	}
}
