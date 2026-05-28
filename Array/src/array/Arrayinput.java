package array;
//Assignment 133
import java.util.Scanner;

public class Arrayinput {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		
		int array[] = new int[size];
		// Iterate the array so that we can store the values in array		
		for(int i = 0; i<size; i ++) {
			// Use scanner to give the prompt to the user
			System.out.println("Enter the value");
			
			// use scanner object to store the integer data in a variable
			int value = scanner.nextInt();
			
			// store the variable in array
			array[i] = value;	
		}
		
		System.out.println("Array elements are"); 
		for(int i = 0; i <size; i ++) {
			System.out.println(array[i]);
		}
		
	}

}
