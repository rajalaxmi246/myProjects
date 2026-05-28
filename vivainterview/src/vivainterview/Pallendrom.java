package vivainterview;

public class Pallendrom {
	public static void main(String[] args) {
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char ch=input.charAt(i);
			output=output+ch;
		}
		if(input.equals(output))
		{
			System.out.println("It is pallendrom");
		
		}
		else
		{
			System.out.println("It is not a pallendrom");
		}
				
	}

}
