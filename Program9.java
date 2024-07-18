package day1;

public class Program9 {
	public static void main(String[] args) {
		int a=5,b=8,temp;
		System.out.println("a="+a );
		System.out.println("b="+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("swapped:");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
