package basicjava;
import java.util.Scanner;
public class Searchin2d {
	static void findValue(int array[][], int find, int row, int column) {
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (find == array[i][j])
					count++;
			}
		}
		if (count != 0)
			System.out.println(find + " do exist in array");
		else
			System.out.println(find + "Not found");

	}

	public static void main(String[] args) {

		System.out.println("Enter the dimensions");
		Scanner sc = new Scanner(System.in);
		int row, column;
		row = sc.nextInt();
		column = sc.nextInt();
		int[][] array = new int[row][column];
		System.out.println("Enter values");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the value to search");
		int find = sc.nextInt();

		findValue(array, find, row, column);
		sc.close();
	}

}
