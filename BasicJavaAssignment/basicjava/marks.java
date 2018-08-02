package basicjava;
import java.util.*;
class marks{
	static int mark(int m1,int m2,int m3){
		//if marks in all 3 is greater than 60;
		if(m1>60&&m2>60&&m3>60){
			System.out.println("Passed");
		}
		//if any two subject has marks greater than 60;
		else if((m1>60&&m2>60)||(m1>60&&m3>60)||(m2>60&&m3>60)){
			System.out.println("Promoted");
		}
		//if one marks is greater than 60 and another two are less than 60;
		else if((m1>60 && m2<60 && m3<60)||(m1<60 && m2<60 && m3>60)||(m1<60 && m2>60 && m3<60)||(m1<60 && m2<60 && m3<60))
			System.out.println("Failed");
	return 0;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter marks1");
	int m1=sc.nextInt();
	System.out.println("Enter marks2");
	int m2=sc.nextInt();
	System.out.println("Enter marks3");
	int m3=sc.nextInt();
	mark(m1,m2,m3);//calling mark method to check student is passed/promoted/failed
	sc.close();
}
}
