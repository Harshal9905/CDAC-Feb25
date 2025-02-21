class CountingNo{
	public static void main(String []args){
		int count = 0;
		for(int i = 10 ; i >= 0 ; i--){
			System.out.print(i + " ");
			count++;
		}
		System.out.println();
		System.out.println(count);
	}
}