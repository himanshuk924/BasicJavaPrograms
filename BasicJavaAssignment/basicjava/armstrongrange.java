package basicjava;
class armstrongrange{
	//to print armstrong number
	static int isarm(int input){
		int temp=0;
		int res=0;
		int val=input;
		while(input>0){
		temp=input%10;
		input=input/10;
		res=res+temp*temp*temp;
		}
		if(val==res){
			System.out.println(val);
		}
		return 0;
	}
	public static void main(String args[]){
	for(int input=100;input<999;input++){
	isarm(input);//calling isarm method to print number in range of 100 to 999 
	}
}
}
