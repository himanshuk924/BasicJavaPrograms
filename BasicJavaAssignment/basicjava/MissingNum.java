package basicjava;
import java.util.Scanner;
public class MissingNum {
	static void missing(int array[],int limit) {
		int total=0;
		int sumofn=(limit-1)*(limit)/2;
		for(int i=0;i<limit-1;i++) {
			total+=array[i];
		}
		System.out.println(sumofn-total);
	}
	public static void main(String[] args) {
		int limit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		limit=sc.nextInt();
		int array[]=new int[limit];
		for(int i=0;i<limit-1;i++) {
			array[i]=sc.nextInt();
		}
		missing(array,limit);
		sc.close();
	}
}
