package assignment1;

public class Assignment22 {
	static void add(int a) {
		System.out.println("static method");
	}
static void add(int a, int b) {
	System.out.println(a+b);
}
void add(double a) {
	System.out.println("non static metod");
}
void add(double a, double b) {
	System.out.println(a+b);
}
public static void main(String[] args) {
	add(10);
	add(10,20);
	Assignment22 a= new Assignment22();
	a.add(10.5);
	a.add(10.5,2.5);
	
}
}
