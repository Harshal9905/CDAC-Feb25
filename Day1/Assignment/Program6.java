import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first Number:");
		int a = sc.nextInt();
		System.out.println("Input Second Number:");
		int b = sc.nextInt();
		int ans1 = a + b;
		System.out.println(a + " + " + b + " = " + ans1);
		int ans2 = a - b;
		System.out.println(a + " - " + b + " = " + ans2);
		int ans3 = a * b;
		System.out.println(a + " * " + b + " = " + ans3);
		int ans4 = a * b;
		System.out.println(a + " * " + b + " = " + ans4);

		int ans5 = a / b;
		System.out.println(a + " / " + b + " = " + ans5);

		int ans6 = a % b;
		System.out.println(a + " mod " + b + " = " + ans6);

}
}