package assignment1;

public class Assignment35 {
	int a=10;// globala varaialbe non static
	static int b=20;//static global varaialbe
	static void show()
	{
		System.out.println(b);
	}
	void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		show();
		Assignment35 a=new Assignment35();
		a.display();
	}
}
