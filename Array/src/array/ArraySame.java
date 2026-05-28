package array;
//Assignment 140
public class ArraySame {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		System.out.println("First Array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"");
		}
		System.out.println("second Array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"");


		}
	}

}
