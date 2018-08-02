package basicjava;
import java.util.Scanner;
public class RemoveDuplicateChar {
	static void removeDuplicacy(String word) {
		String res=" ";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(ch!=' ') {
				res=res+ch;
			}
			word=word.replace(ch,' ');
		}
		System.out.println(res);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter words");
		String word=sc.next();
		removeDuplicacy(word);
		sc.close();
	}
}
