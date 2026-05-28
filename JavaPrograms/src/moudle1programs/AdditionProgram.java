package moudle1programs;

public class AdditionProgram {
	AdditionProgram(Double a)
	{
		System.out.println("constructor 1");
	}
	AdditionProgram(int a)
	{
		this(10.2);
	

		System.out.println("constructor 2");
	}
	AdditionProgram(int a, int b)
	{
		this(100);
		System.out.println("constructor 3");
		
	}
	public static void main(String[] args) {
		new AdditionProgram(10,20);
	}
	

}

