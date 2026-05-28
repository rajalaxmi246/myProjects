package test1;



public class Flipkart {
	static void add() {
		System.out.println("static method");
	}
void sub()
{
	System.out.println("Non static method");
}
Flipkart()
{
System.out.println("constructor Method");
}
public static void main(String[] args) {
	add();
	Flipkart f1=new Flipkart();
	f1.sub();
}
}

