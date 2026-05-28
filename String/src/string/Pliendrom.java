package string;
//Assignment 131
public class Pliendrom {
	public static void main(String[] args) {
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			char ch = input.charAt(i);
			output = output+ch;
		}
			
		if(input.equals(output))
			System.out.println("This is paliendrom");
		else
		{
			System.out.println("This is not plaiendrom");
			
		}
			
	}

}
