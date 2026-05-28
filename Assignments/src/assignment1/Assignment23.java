package assignment1;

public class Assignment23 {
	static void add() {
		System.out.println("1st method");
	}
static void add(int a, int b) {
	System.out.println(a+b);
}
public void sub() {
	System.out.println("non static");
}
public void sub(int a, int b) {
	System.out.println(a-b);
}
public static void main(String[] args) {
	add();
	add(10,20);
	Assignment23 a=new Assignment23();
	a.sub();
	a.sub(20,30);
}
}
