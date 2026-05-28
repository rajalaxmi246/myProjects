package test1;

public class Methodoverloading {
	static void add() {
		System.out.println("Addition 1");
	}
static void add(int a) {
	System.out.println("Addition 2");
}
public static void main(String[] args) {
	add();
	add(100);
}
}
