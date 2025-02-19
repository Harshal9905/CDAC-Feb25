import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number:");
		int a = sc.nextInt();
		for(int i = 1; i<=10; ++i){
			int ans = a * i;
			System.out.println(a + " x " + i + " = " + ans);
}		
}
}