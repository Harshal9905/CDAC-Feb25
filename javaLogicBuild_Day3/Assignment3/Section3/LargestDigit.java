class LargestDigit{
	public static void main(String []args){
		int num = 4974;
		int largest = 0;
		while(num!=0){
			int lastDigit = num%10;
			if(largest>lastDigit){
				largest = largest;
			}else{
				largest = lastDigit;
			}
			num /= 10;
		}
		System.out.print(largest);
	}
}