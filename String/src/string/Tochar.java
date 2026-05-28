package string;
//Assignment 132
public class Tochar {
	public static void main(String[] args) {
		String str="Java";
		str=str.toLowerCase();
		int vowel=0;
		int consonant=0;
	for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
				//System.out.println("It is vowel:"+vowel);
				
			}
			
				else
				{
					consonant++;
					//System.out.println("It is consonant:"+consonant);
					
				}
			
		}
	
	System.out.println("Vowel: " +vowel);
	System.out.println("Consonant: " +consonant);
	}
}
