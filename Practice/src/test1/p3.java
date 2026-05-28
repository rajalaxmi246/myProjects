package test1;

class p5
{
	p5(int k,int z)
	{
		System.out.println("Constructor of Grand parent");
	}
}
	class p4 extends p5
	{
		p4(int a, int b)
		{
			super(20,30);
			
			System.out.println("Constructor of parent class");
		}
	}
	public class p3 extends p4
	{
		p3()
		{
			super(10,20);
			
			System.out.println("Constructor of child class");
		}
	public static void main(String[] args) {
		new p3();
		
	}
	}
	
	
	
	

	
		
			
		
	
	
	

	


