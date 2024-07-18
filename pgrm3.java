package day1;

import java.util.Scanner;

public class pgrm3 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number : ");
	int n=sc.nextInt();
	int fact=1, i;
	for(i=1;i<=n;i++) {
		fact=fact*i;	
	}
	System.out.println("Factorial of"+n +fact);
	}
}
