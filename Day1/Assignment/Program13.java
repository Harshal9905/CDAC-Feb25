import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		System.out.println("Input Second number");
		int b = sc.nextInt();
		System.out.println("Input third number");
		int c = sc.nextInt();
		
		double avg = (a + b + c)/3;

		System.out.printf("The average is : %f", avg);
	}
}