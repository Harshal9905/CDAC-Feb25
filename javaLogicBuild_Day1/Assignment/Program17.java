import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		int i =1 ;

		while(i<=a){
			System.out.print(i +" ");
			i++;
		}
	}
}