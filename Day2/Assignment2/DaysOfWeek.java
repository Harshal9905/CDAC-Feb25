import java.util.Scanner;

public class DaysOfWeek{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (1-7) for the day of the week:");
		int day = sc.nextInt();	
	
		switch(day){

			case 1:
				System.out.println("Monday");
				switchType("Weekday");
				break;
			case 2:
				System.out.println("Tuesday");
				switchType("Weekday");
				break;
			case 3:
				System.out.println("Wednesday");
				switchType("Weekday");
				break;
			case 4:
				System.out.println("Thursday");
				switchType("Weekday");
				break;
			case 5:
				System.out.println("Friday");
				switchType("Weekday");
				break;
			case 6:
				System.out.println("Saturday");
				switchType("Weekday");
				break;
			case 7:
				System.out.println("Sunday");
				switchType("Weekend");
				break;
			default:
				System.out.println("Invalid input! Please enter a number between 1 and 7.");
		}
	}

	 // Nested switch-like method to classify weekday or weekend
    	public static void switchType(String type) {
        	switch (type) {
            	case "Weekday":
                		System.out.println("It's a Weekday.");
                		break;
            	case "Weekend":
                		System.out.println("It's a Weekend.");
                		break;
        	}
    	}
	
}