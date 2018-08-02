package basicjava;
import java.util.*;
class sici{
	//TO print simple interest and compound interest
	static int sicic(int p,int r,int t){
		double si=(p*r*t)/100;
		double ci=p*Math.pow((1+r/100),t)-p;
		System.out.println("Simple Interest"+si);
		System.out.println("Compound Interest"+ci);
		return 0;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int p=sc.nextInt();
	int r=sc.nextInt();
	int t=sc.nextInt();
	sicic(p,r,t);
	sc.close();
}
}
