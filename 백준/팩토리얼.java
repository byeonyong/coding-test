package 백준;

import java.util.Scanner;

public class 팩토리얼 {

	
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	scan.close();
	
	int sum = factorial(n);
	System.out.println(sum);

	}
	
	public static int factorial(int n) {
		
		if(n <= 1) {
			return 1;
		}
		
		
		return n*factorial(n-1); 
	}
	
	
}
