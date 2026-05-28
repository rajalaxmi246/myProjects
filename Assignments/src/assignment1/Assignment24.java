package assignment1;

public class Assignment24 {
	static void add() {
		System.out.println("Rajalaxmi");
	}
static void add(int a, int b) {
	System.out.println(a+b);
}
static void add(int a,int b, int c) {
	System.out.println(a+b+c);
}
static void add(double a, double b) {
	System.out.println(a+b);
}
static void add(double a,double b, double c) {
	System.out.println(a+b+c);
}
void sub() {
	System.out.println("Non static");
}
void sub(int a, int b) {
	System.out.println(a-b);
}
void sub(int a, int b, int c) {
	System.out.println(a-b-c);
}
void sub(double a, double b) {
	System.out.println(a-b);
}
void sub(double a, double b, double c) {
	System.out.println(a-b-c);
}
public static void main(String[] args) {
	add();
	add(10,20);
	add(10,20,30);
	add(2.5,3.5);
	add(2.5,3.5,4.5);
	Assignment24 a=new Assignment24();
	a.sub();
	a.sub(10,20);
	a.sub(10,20,30);
	a.sub(2.5,3.5);
	a.sub(2.5,3.5,4.5);
	
	
}
}
