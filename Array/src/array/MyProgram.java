package array;

public class MyProgram {
	static void add()
	{
		System.out.println("This static method 1");
	}
static void add(int a)
{
	System.out.println("This is static method 2");
}
void show()
{
	System.out.println("This nonstatic method 1");
}
void show(int b)
{
	System.out.println("This is non static method 2");
}
MyProgram()
{
	this(100);
System.out.println("This constructor 1");
}
MyProgram(int a)
{
	
	System.out.println("This is constructor 2");
	
		  
	}
		
	public static void main(String[] args) {
		add();
		add(100);
	
		MyProgram m=new MyProgram();
		m.show();
		m.show(10);
		
		
				
	}
}

