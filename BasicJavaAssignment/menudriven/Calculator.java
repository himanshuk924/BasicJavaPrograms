package menudriven;
import java.util.Scanner;
public class Calculator 
{
int add(int num1,int num2){//ADD TWO NUMBERS
	return num1+num2;
}
int mul(int num1,int num2){//MULTIPLY TWO NUMBERS
	return num1*num2;
}
int sub(int num1,int num2){//SUBTRACT TWO NUMBERS
	if(num1>num2)
	return num1-num2;
	else
	return num2-num1;	
}
float div(int num1,int num2){//DIVIDE TWO NUMBERS
	return num1/num2;
}
Scanner sc=new Scanner(System.in);
public Calculator() {
	System.out.println("Enter your two numbers");
	int num1,num2;
	String c;
	num1=sc.nextInt();
	num2=sc.nextInt();
	//USER ENTER HIS CHOICE TO DO AIRTHMETIC OPERATION
	System.out.println("Enter your choice-");
	System.out.println("+");
	System.out.println("-");
	System.out.println("*");
	System.out.println("/");
	c=sc.next();
	switch(c){
	case "+": {
		       System.out.println(add(num1,num2));//INVOKING ADD METHOD
			   break;
			   }		
	case "*": {
		 System.out.println(mul(num1,num2));//INVOKING MUL METHOD
				break;
			  }
			  
	case "/": {
		 System.out.printf("%.2f",div(num1,num2));//INVOKING DIV METHOD
				break;		  
			  }
	  		 
	case "-": {
		 System.out.println(sub(num1,num2));//INVOKING SUB METHOD
		        break;
		      }
	default:  {
		        System.out.println("Invalid value");
	           }
	}
}
}