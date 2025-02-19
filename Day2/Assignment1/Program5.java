import java.util.Scanner;
class Demo{
 	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Side of square");
		int side = sc.nextInt();

		int area = side*side;

		System.out.println("area of the Sqare is "+area);
	}
}