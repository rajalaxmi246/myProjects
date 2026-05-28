package dailypractice;

public class Overloading {
	static void add() {
		System.out.println("Rajalaxmi");
	}
static void add(int a, int b) {
	System.out.println(a+b);}
void add(int a, double b) {
	System.out.println(a+b);}
void sub() {
	System.out.println("Nonstatic");
	
}
Overloading(){
	System.out.println("constructor");}
Overloading(int a, char c){
	System.out.println(a+c);
	System.out.println("parametrized cons");
}

	public static void main(String[] args) {
		add();
		add(100, 200);
		Overloading o1=new Overloading();
		new Overloading(10, 'c');
	
		o1.add(10, 10.5);
		
	o1.sub();}
}

	
		


			
			
		
	
			
	
	




