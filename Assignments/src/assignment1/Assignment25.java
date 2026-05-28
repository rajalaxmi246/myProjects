package assignment1;

public class Assignment25 {
	static void add() {
		System.out.println("static method");
	}
	void sub() {
		System.out.println("Non static method");
	}
	Assignment25(){
		System.out.println("Constructor");
	}
	public static void main(String[] args) {
		add();
		Assignment25 a=new Assignment25();
		a.sub();
		
	}
}
