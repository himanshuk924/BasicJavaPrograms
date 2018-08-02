package basicjava;
import java.util.Scanner;
public class sentence {
	static void removeWordAndExtraSpace(String sentence,String word,int pos	){
		String newsentence=sentence.replaceAll("\\s+", " ");
		String wordsarray[]=newsentence.split(" ");
		String res="";
		for(int i=0;i<wordsarray.length;i++) {
			if(!(wordsarray[i].equals(wordsarray[pos]))){
				res+=wordsarray[i];
				res+=" ";
			}
		}
			if(wordsarray[pos].equals(word))
			System.out.print(res+" ");
			else
			System.out.print("their must be wrong position or wrong word is entered");	
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your input");
		String sentence=sc.nextLine();
		System.out.println("Enter word to be deleted");
		String word=sc.next();
		System.out.println("Enter word position to be deleted");
		int pos=sc.nextInt();
		removeWordAndExtraSpace(sentence,word,pos);
		sc.close();
	}

}
