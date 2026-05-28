package assignment1;


public class Assignment29 {
	Assignment29(){
		System.out.println("constructor");
	}
	Assignment29(int a, int b)
	{
		System.out.println("constructor1");
	}
	Assignment29(char a, char b){
		System.out.println("constructor2");
	}
	Assignment29(String a, String b){
		System.out.println("constructor3");
	}
static void method1(int a, int b) {
	System.out.println("Method1");
}
static void method1(char a, char b) {
	System.out.println("Method2");
		}
static void method1(String a, String b) {
	System.out.println("Method3");
}
void add(int a, int b) {
	System.out.println(a+b);}
void add(int a,int b,int c) {
	System.out.println(a+b+c);
}
public static void main(String[] args) {
	new Assignment29();
	new Assignment29(10,20);
	new Assignment29('a','b');
	new Assignment29("Test","Automation");
	method1(10,20);
	method1('r','T');
	method1("Test","Automation");
	Assignment29 a=new Assignment29();
			a.add(10, 20);
			a.add(100,222,300 );
	
	
}

 
	
}

