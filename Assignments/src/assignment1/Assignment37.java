 package assignment1;

public class Assignment37 {
static int a=30;// static global varialbe
static int b=30;//static global varialbe
int y=20;//non static global varialbe
int z=40;// non static global varialbe
static void add(int a, int b) {
	System.out.println(a+b);
}

void sub(int y, int z ) {
	System.out.println(y-z);
}
public static void main(String[] args) {
	add(30,30);
	Assignment37 a= new Assignment37();
	a.sub(20,40);
	
	
}
}
