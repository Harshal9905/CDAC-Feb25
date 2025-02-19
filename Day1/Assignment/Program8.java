import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first Number : ");
		int a = sc.nextInt();
		System.out.println("Input second Number : ");
		int b = sc.nextInt();
		a = a+b;
		b = a -b;
		a = a- b;
		System.out.println("after swap a is "+ a );
		System.out.println("after swap b is "+ b);
//a== a+b
//b== a - b
//a == a - b 
		
		
}
}