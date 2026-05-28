package array;

public class Catanimal extends Doganima {
	void show()
	{
		System.out.println("Cat says miao");
	}
public static void main(String[] args) {
	Catanimal c=new Catanimal();
	c.show();
	c.eat();
	c.sound();
	
}
}
