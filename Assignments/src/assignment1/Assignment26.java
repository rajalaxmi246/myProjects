package assignment1;

public class Assignment26 {
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	Assignment26(int a, int b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add(10,20);
		Assignment26 a=new Assignment26(10, 20);
		a.sub(20, 30);
		
	}
}
