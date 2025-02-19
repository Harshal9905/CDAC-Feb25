import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input temperature in Celsius");
		int a = sc.nextInt();
		
		int fahrenheit = (a * 9/5) + 32;

		System.out.printf(a + "C is Equal to "+ fahrenheit );
		
	}
}