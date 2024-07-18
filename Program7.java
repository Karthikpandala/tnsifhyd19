package day1;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a, b,c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println(" a is larger");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is larger");
			
		}
		else
		{
			System.out.println("c is larger");
		}
		
		
	}

}
