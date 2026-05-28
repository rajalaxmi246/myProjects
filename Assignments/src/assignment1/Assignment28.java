     package assignment1;

public class Assignment28 {
	Assignment28 (int a, int b) {
		System.out.println(a+b);
	}
	Assignment28 (double a, double b, double c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		new Assignment28(10,20);
		new Assignment28(10.5, 10.6,10.7);
		
	}

}
