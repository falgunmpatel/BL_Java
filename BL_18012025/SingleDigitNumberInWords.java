import java.util.*;

public class SingleDigitNumberInWords {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a single digit number: ");
		int num = sc.nextInt();
		System.out.print("The number in words is: ");
		switch (num) { 
			case 1: System.out.println("One");
				break;
			case 2:  System.out.println("Two");
				 break;
			case 3:  System.out.println("Three");
				 break;
			case 4:  System.out.println("Four");
				 break;
			case 5:  System.out.println("Five");
				 break;
			case 6:  System.out.println("Six");
				 break;
			case 7:  System.out.println("Seven");
				 break;
			case 8:  System.out.println("Eight");
				 break;
			case 9:  System.out.println("Nine");
				 break;
			default: System.out.println("Invalid Input!!");
				 break;
		}
	}
}
