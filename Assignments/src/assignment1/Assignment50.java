package assignment1;
import java.util.Scanner;

public class Assignment50 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking age input at runtime
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Checking eligibility
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        sc.close();
    }
}



