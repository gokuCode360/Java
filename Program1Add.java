package Test1;

import java.util.Scanner;

public class Program1Add {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Press 1 to add Intergers");
		System.out.println("Press 2 to concatinate String");
		
		int val = s.nextInt();
		
		switch (val) {
		case 1:
			System.out.println("Enter 3 Integers");
			int i1 = s.nextInt();
			int i2 = s.nextInt();
			int i3 = s.nextInt();
			add(i1,i2,i3);
			
			break;
		case 2 :
			System.out.println("Enter 2 words");
			String s1 = s.next();
			String s2 = s.next();
			add(s1,s2);
			
			break;

		default:
			System.out.println("You have provided wrong input");
			
			break;
		}
	

	}

	private static void add(String s1, String s2) {

		System.out.println("Concatinated string is : "+s1+"-"+s2);
		
	}

	private static void add(int i1, int i2, int i3) {
		int result = i1+i2+i3;
		System.out.println("Total of "+i1+" , "+i2+" & "+i3+" is "+result);
		
	}
	

}
