package basicjava;
class armstrong{
	//To check Number is Armstrong or Not
	static void isarm(int input){
		int temp=0;
		int res=0;
		int val=input;
		while(input>0){
		temp=input%10;
		input=input/10;
		res=res+temp*temp*temp;
		}
		if(val==res){
			System.out.println("armstrong");
		}
		else{
			System.out.println("not armstrong");
		}
	}
	public static void main(String args[]){
	int num=Integer.parseInt(args[0]);
	isarm(num);//calling is arm method
	}
}