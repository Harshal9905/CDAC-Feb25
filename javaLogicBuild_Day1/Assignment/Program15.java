import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		int i = 1;
		int fact = a;
		while(i<a){
			fact = fact * (a-i);
			i++;
		}
		System.out.printf("The Factorial is : %d", fact);
	}
}