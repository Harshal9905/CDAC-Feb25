class Prime {
	public static void main(String []args){
		int count = 0;
		int num = 2;
		while(count < 5){
			boolean isPrime= true;
			for(int i = 2; i*i<=num; i++){
				if(num % i==0){
					isPrime = false;
					break;
				}
				
			}
			if(isPrime){
				System.out.print(num + " ");
				count++;
			}
			num++;
		}
	}
}