package basicjava;
class square{
	//to print square of number
	static int squarefun(int input){
		return input*input;
	}
	public static void main(String args[]){
	int num=Integer.parseInt(args[0]);
	System.out.println(squarefun(num));
	}
}