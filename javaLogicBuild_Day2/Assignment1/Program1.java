import java.util.Scanner;
class Demo{
 	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number: ");
		int a = sc.nextInt();
		if(a==0){
			System.out.println("Given numberis Zero ");
		} else if(a>0){
			System.out.printf("The number %d is Positive\n", a);
		} else {
			System.out.printf("The number %d is Negative\n", a);
		}
}
}