package Test1;

import java.util.Scanner;

public class Program2Bank {

	public static void main(String[] args) {

		System.out.println("Hi, we are here to provide you the intrest deails.");
		System.out.println("Please select bank from below.");
		System.out.println("1 : SBI");
		System.out.println("2 : ICICI");
		System.out.println("3 : AXIS");
		 
		Scanner s = new Scanner(System.in);
		int value = s.nextInt();
		
		switch (value) {
		case 1:
			System.out.println("Intrest rate of SBI is 7%");
			break;
		case 2 :
			System.out.println("Intrest rate of ICICI is 8%");
			break;
		case 3 :
			System.out.println("Intrest rate of AXIS is 9%");
			break;
		default:
			System.out.println("Unable to find a Bank on your input");
			
			break;
		}
		

	}


}
