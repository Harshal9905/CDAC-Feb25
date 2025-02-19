import java.util.Scanner;
class Demo{
 	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input length of Rectangle");
		int length = sc.nextInt();
		
		System.out.println("Input breadth of rectangle");
		int breadth = sc.nextInt();

		int area = length *breadth ;

		System.out.println("area of the rectangle is "+area);
	}
}