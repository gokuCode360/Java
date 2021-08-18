package Test1;

import java.util.Scanner;

public class Program3Mult {

	public static void main(String[] args) {

		System.out.println("Enter an interger");
		 
		Scanner s = new Scanner(System.in);
		int i1= s.nextInt();
		
		Multi(i1);

	}

	private static void Multi(int N) {

		for (int i=1;i<=10;i++) {
			int mul = i*N;
			System.out.println(i+" X "+N+" = "+mul);
		}
			
		
	}

}
