package basicjava;
import java.util.*;
class tax{
	//to print deducted tax amount from ctc
	static long taxm(long ctc){
		if(ctc>0&&ctc<180000){
			System.out.println(ctc);
		}
		else if(ctc>181001&&ctc<300000){
			System.out.println((ctc*10)/100);
		}
		else if(ctc>300001&&ctc<500000){
			System.out.println((ctc*20)/100);
		}
		else if(ctc>500001&&ctc<1000000){
			System.out.println((ctc*30)/100);
		}
		return 0;
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter CTC");
	long ctc=sc.nextInt();
	taxm(ctc);
	sc.close();
}
}
