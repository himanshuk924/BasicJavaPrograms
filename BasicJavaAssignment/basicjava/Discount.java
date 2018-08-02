package basicjava;
import java.util.Scanner;
public class Discount {
	static void calculateDiscount(int newItem) {
		double discount;
		double newItemPrice;
		discount=.35*newItem;
		newItemPrice=newItem-discount;
		System.out.println("Item amount "+newItem+" after 35% discount which is "+discount+" will be "+newItemPrice);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int newItem;
		System.out.println("Enter the price of the item");
		newItem=sc.nextInt();
		calculateDiscount(newItem);
		sc.close();
	}

}
