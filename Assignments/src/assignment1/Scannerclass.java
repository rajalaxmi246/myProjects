package assignment1;

import java.util.Scanner;

class Scannerclass {
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Write My Name");
		String name = s1.nextLine();
		System.out.println(name);
		
		
		System.out.println("enter you age");
		int age = s1.nextInt();
		System.out.println(age);
		
		System.out.println("enter your salary");
		double salary = s1.nextDouble();
		System.out.println(salary);
		
		System.out.println("enter height");
		short height = s1.nextShort();
		System.out.println(height);
		
		System.out.println("enter a long value");
		long value = s1.nextLong();
		System.out.println(value);
		
		System.out.println("enter byte value");
		byte ball = s1.nextByte();
		System.out.println(ball);
		
		System.out.println("enter a boolean value");
		boolean b = s1.nextBoolean();
		System.out.println(b);
		
		System.out.println("enter a word");
		String s=s1.next();
		System.out.println(s);
		
		s1.close();
		
		System.out.println("Closed");
		
		

	}

}
