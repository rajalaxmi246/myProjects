package test1;

public class Methodoverloading1 {
	static void add(int a, double b) {
		double c=a+b;
		System.out.println(c);
	}
	static void add(double a, int b) {
		double c=a+b;
		System.out.println(c);
	}
static void add(double a, double b) {
	double c=a+b;
	System.out.println(c);
}
public static void main(String[] args) {
	add(1.1,1.2);
	add(1.5,5);
	add(1,1.3);
}
}
