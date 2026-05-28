package assignment1;

public class Assignment9 {
	static void square()
	{
		int side=4;
		int area=side*side;
		int circumference=4*side;
		System.out.println(area);
		System.out.println(circumference);
	}
	static void rectangle() {
	int lenght=10;
	int width=4;
	 int area=lenght*width;
	 int circumference=2*(lenght+width);
	System.out.println(area);
	System.out.println(circumference);}
	static void triangle() {
	int base=6;
	int height=4;
	int side1=5;
	int side2=6;
	int side3=7;
	int area=(int) (0.5*base*height);
	  int circumference=side1+side2+side3;
	System.out.println(area);
	System.out.println(circumference);}
	static void circle() {
	double radius=7;
	double areacircle=3.14*radius*radius;
	double circumferencecircle=2*3.14*radius;
	System.out.println(areacircle);
	System.out.println(circumferencecircle);
	}
	public static void main(String[] args) {
		square();
		rectangle();
		triangle();
		circle();
	}
}
	

