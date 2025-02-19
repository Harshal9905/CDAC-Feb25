import java.util.Scanner;
class Demo{
 	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = sc.nextInt();
		if(a==0){
			System.out.println("Given number Zero which is not even nor odd");
		} else if(a%2==0){
			System.out.printf("The number %d is even\n", a);
		} else {
			System.out.printf("The number %d is odd\n", a);
		}
}
}