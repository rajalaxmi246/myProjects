package dailypractice;
class a1
{
	static void add(int a)
	{
		System.out.println("print a");
	}

}
public class Override extends a1 {
	static void add(int a, int b)
	{
		System.out.println("print a1");
	}
	public static void main(String[] args) {
		add(100);
		add(100,200);
	}

}
