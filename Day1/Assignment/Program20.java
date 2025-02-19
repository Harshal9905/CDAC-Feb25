import java.util.Scanner;
class Demo{
	public static void main(String []args){
		Scanner sc = new Scanner(System .in);
		System.out.println("Input first number");
		int a = sc.nextInt();
		int num = a;
		int count =0 ;

		while(num!=0){
			num/=10;
			count+=1;
		} 
		System.out.print("The number "+  a+ " has " + count + " digits.");
	}
}