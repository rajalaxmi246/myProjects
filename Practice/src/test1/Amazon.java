package test1;

public class Amazon {
	Amazon()
	{
		System.out.println("Constructor 1");
	}
	Amazon(int a)
	{
		System.out.println("Constructor 2");
	}
Amazon(int a, int b, int c)
{
	System.out.println("Constructor 3");
}
public static void main(String[] args) {
	new Amazon();
	new Amazon(100);
	new Amazon(10,20,30);
}
}
