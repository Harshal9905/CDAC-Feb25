class Factorial{
	public static void main(String []args){
		int fact = 10;
		for(int i = 10; i>1; i--){
			System.out.print(i + " * ");
			fact = fact* (i - 1);
		}
		System.out.println(fact);
	}
}