package dailypractice;

 class Substraction {
	Substraction(int a)
	{
		System.out.println("constructor 1");
	}
	Substraction()
	{
		this(100);
		System.out.println("constructor 2");
	}
	public class Substraction2 extends Substraction
	{
		Substraction2(int a, double b)
		{
			super();
			System.out.println("constructor 3");
		}
		Substraction2()
		{
			this(100,23.4);
			System.out.println("constructor 4");
		}
		public static void main(String[] args) {
			new Substraction();
			
		}
		
		
		
	}

}
