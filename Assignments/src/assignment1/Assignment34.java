package assignment1;

public class Assignment34 {
	static void display() {
		int a= 10;//local varaible static
		System.out.println(a);
	}
	void show() {
		int b=20;// local variable non static
		System.out.println(b);
	}
	public static void main(String[] args) {
		display();
		Assignment34 a=new Assignment34();
		a.show();
		
	}

}
