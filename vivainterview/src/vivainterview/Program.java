package vivainterview;
import java.util.ArrayList;
import java.util.Iterator;
public class Program {
	public static void main(String[] args) {
		ArrayList<String>list= new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		Iterator<String>i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
 