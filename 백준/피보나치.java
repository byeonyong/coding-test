package 백준;

import java.util.Scanner;

public class 피보나치 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		int result = fibonacci(num);
		System.out.println(result);
		
	}
	
	public static int fibonacci(int n) {
		
		if(n==0) return 0;
		if(n==1) return 1;
		
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
}
