package basicjava;
import java.util.ArrayList;
import java.util.Scanner;
public class DescendPalindrome {
	static void sort( ArrayList<String>input) {
		String temp;
        String palindrome[]=input.toArray(new String[input.size()]);
        for(int outer=0;outer<palindrome.length-1;outer++) {
       	 for(int inner=0;inner<palindrome.length-outer-1;inner++) {
       		 if((palindrome[inner].length())<palindrome[inner+1].length()){
       			 temp=palindrome[inner];
       			 palindrome[inner]=palindrome[inner+1];
       			 palindrome[inner+1]=temp;
       		 }
       	 }
        }
        for(String out:palindrome)
        System.out.println(out);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        ArrayList<String>input=new ArrayList<>();
        for(int i=0;i<10;i++){
        	String str=sc.next();
        	StringBuffer stb=new StringBuffer(str);
        	String rev=stb.reverse().toString();
        	if(str.equals(rev)) {
        		input.add(str);
        	}
        }
        sort(input);
        sc.close();
	}

}
