package ����;

import java.util.Scanner;

public class �Ǻ���ġ {
	
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
