package Test1;

import java.util.Scanner;

public class Program4Pattern {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int N= s.nextInt();
				
		for(int i=1; i<=N; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
