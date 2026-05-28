package test1;

public class Flipkart2 {
	static void add() {
		System.out.println("static method");
	}
void sub() {
	System.out.println("Npn static method");
}
Flipkart2(){
	System.out.println("Constructor method");
}
public static void main(String[] args) {
	add();
	Flipkart2 f2=new Flipkart2();
	f2.sub();
	Flipkart2 f3=new Flipkart2();
	f3.sub();
}
}
