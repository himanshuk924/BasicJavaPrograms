package basicjava;

import java.util.Scanner;

public class Search {
	//to search number
	static void searchNum(int a[],int num){
		for(int i=0;i<15;i++){
			if(num==a[i]){
				System.out.println(num+"Value is found at"+i); 
				break;
			}
			else 
				System.out.println("Number is not found in array");
			break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int []array=new int[15];
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter values");
       for(int i=0;i<15;i++){
    	   array[i]=sc.nextInt();
       }
       System.out.println("Value to be search");
       int num=sc.nextInt();
       searchNum(array,num);
       sc.close();
	}

}
