import java.util.Scanner;
class Demo{
 	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a time: ");
		int time = sc.nextInt();
		if(time>=5 && time <=12){
			System.out.println("Good Morning");
		}
}
}