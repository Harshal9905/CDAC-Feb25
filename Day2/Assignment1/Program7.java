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
		if(a>b){
			if(a>c){
				System.out.printf("The largest number is %d", a);
		
			}else{
				System.out.printf("The largest number is %d", c);
			}
		}else{
			if(b>c){
				System.out.printf("The largest number is %d", b);
		
			}else{
				System.out.printf("The largest number is %d", c);
			}
		}
	}
}