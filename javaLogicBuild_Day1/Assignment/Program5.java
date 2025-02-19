import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();	
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		int ans = a * b;
		System.out.println(a +"x" + b + "="  + ans);
}
}