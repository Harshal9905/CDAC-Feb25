import java.util.Scanner;

public class DiscountCalc{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total purchase amount (Rs.): ");
        	double totalAmount = sc.nextDouble();
		
		System.out.println("Do you have a membership card? (yes/no): ");
        	String membership = sc.next().toLowerCase();

		double discount = 0;
			
		if(totalAmount>=1000){
			discount = 20;
		}else if(totalAmount >= 500){
			discount = 10;
		}else {
			discount = 5;
		}
		
		if(membership.equals("yes")){
			discount+=5;
		}	

		double discountAmount = (discount/100)* totalAmount;
		double finalAmount = totalAmount - discountAmount;

		System.out.println("Total Purchase Amount: Rs. " + totalAmount);
        	System.out.println("Discount Applied: " + discount + "%");
        	System.out.println("Discount Amount: Rs. " + discountAmount);
        	System.out.println("Final Amount to Pay: Rs. " + finalAmount);
	}
}