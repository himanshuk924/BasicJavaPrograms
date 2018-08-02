package basicjava;
import java.util.Scanner;
public class BubbleSort {
	//sort function which uses bubblesort algorithm
	static int[] sort(int a[], int range) {
		for (int k = 0; k < range - 1; k++) {
			for (int j = 0; j < range - k - 1; j++) {
				int temp = 0;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range of array");
		int range = sc.nextInt();
		int a[] = new int[range];
		System.out.println("Enter the values");
		for (int i = 0; i < range; i++) {
			a[i] = sc.nextInt();
		}
		a = sort(a, range);//calling sort function which returns a sorted array
		for (int i = 0; i < range; i++) {
			System.out.println(a[i]);
		}
	sc.close();
	}
}
