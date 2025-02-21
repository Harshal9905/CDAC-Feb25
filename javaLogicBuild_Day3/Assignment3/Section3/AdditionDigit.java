class AdditionDigit{
	public static void main(String []args){
		int num = 1234;
		int sum = 0;
		while(num!=0){
			int lastDigit = num%10;
			sum +=lastDigit;
			num /= 10;
		}
		System.out.print(sum);
	}
}