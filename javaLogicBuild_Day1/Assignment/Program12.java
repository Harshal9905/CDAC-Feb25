import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int a = sc.nextInt();
		int num = a;
		int reverse = 0;
		
		while(num!=0){
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}
		System.out.printf("The reverse of %d is %d", a , reverse);
	}
}