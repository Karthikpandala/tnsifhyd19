//Java program to Demonstrate overloading of static and instance members
package overloading;

public class methodoverloading {
	int add(int a,int b) // add method has two parameters 
	{
		 System.out.println("Add method with two parameters called:");
		 return a+b;
	}
	int add(int a, int b,int c) // add method has three parameters 
		 {
			 System.out.println("add method with three parameters is called:");
		  return a+b+c;
		 }

		public static void main(String[] args) {
			
			methodoverloading a1= new methodoverloading();
			  System.out.println("a+b= "+ a1.add(10, 20));
			  System.out.println("a+b+c="+a1.add(10, 20,30));
			
		}

}
