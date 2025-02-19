import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input base number");
		int a = sc.nextInt();
		System.out.println("Input exponent number");
		int b = sc.nextInt();
		
		int power= (int)Math.pow(a,b);

		System.out.printf(a + " raised to the power "+ b+" is "+ power);
		
	}
}