import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		//Float pi = 3.14f;
		System.out.println("Input the radius : ");
		int radius = sc.nextInt();
		double area = Math.PI * Math.pow(radius,2);
		System.out.printf("Area of circle: %.5f ", area);
}
}