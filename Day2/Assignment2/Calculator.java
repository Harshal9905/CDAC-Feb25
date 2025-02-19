import java.util.Scanner;
public class Calculator{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter first number: ");
       	double num1 = sc.nextDouble();

        	System.out.println("Enter an operator (+, -, *, /): ");
        	char operator = sc.next().charAt(0);

        	System.out.println("Enter second number: ");
        	double num2 = sc.nextDouble();

		double result = 0;
       	boolean validOperation = true; 
	
		switch(operator){
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				if(num2 == 0){
					System.out.println("Error: Division by zero is not allowed!");
					validOperation = false;
				} else{
					result = num1 / num2;
					
				}
				break;
			default:
				System.out.println("Invalid operator! Please enter one of (+, -, *, /).");
				validOperation = false;	
		}
		
		if(validOperation ){
			System.out.println("Result: "+ result);	
		}
		
	}
}