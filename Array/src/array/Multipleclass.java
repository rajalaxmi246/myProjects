package array;
//multiplelevel 2parent 1 child
 interface Parent1 
{
	 void display();
}
	


	interface Parent2 extends Parent1
	{
		void display();
	}
		
	
	

public class Multipleclass implements Parent1,Parent2 {
	public static void main(String[] args) {
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
