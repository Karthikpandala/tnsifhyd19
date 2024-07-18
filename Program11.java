package day1;

import java.util.Scanner;

public class Program11 {
	public static void main(String[] args) {
		double a,b,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a, b,");
		a=sc.nextDouble();
		b=sc.nextDouble();
		avg=(a+b)/2;
		System.out.println("average of "+a+"and"+b+ "is"+avg);
	}

}
