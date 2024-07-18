package day2;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
public class program6 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a big integer");
		BigInteger value1=input.nextBigInteger();
		System.out.println("using nextBigInteger()"+value1);
		System.out.println("enter a big decimal");
		BigDecimal value2=input.nextBigDecimal();
		System.out.println("using nextBigDecimal()"+value2);
		input.close();
		

	}

}
