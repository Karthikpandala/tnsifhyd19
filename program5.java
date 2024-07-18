package day2;
import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the name");
		String value=input.nextLine();
		System.out.println("using nextLine():"+value);
		input.close();
	}

}
