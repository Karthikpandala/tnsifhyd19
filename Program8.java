package day1;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();
		String reversedStr="";
		for (int i=str.length()-1;i>=0;i--)    
		{
			reversedStr+=str.charAt(i);
		}
		if(str.equals(reversedStr)) {
			System.out.println(str+ "is a Palindrome");
			
		}
		else
		{
			System.out.println(str+ " is not a palindrome");
		}
	}

}
