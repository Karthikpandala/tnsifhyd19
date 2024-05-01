package sample;

public class Task2 {
	int a=2;
static int b=5;
void display() {
	 System.out.println("you ");
}
public static String  display2(){
	return "hello your in display2";
}
public class Access{
	public static void main(String[] args) {
		Task2 t1= new Task2();
		 System.out.println(t1.a);
		 t1.display();
		 System.out.println(Task2.b);
		 display2();		
}
}
}