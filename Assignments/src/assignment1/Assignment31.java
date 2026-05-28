package assignment1;
import java.util.Scanner;
public class Assignment31{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter side of square: ");
        double side = sc.nextDouble();
        double squareArea = Math.pow(side, 2);
        double squarePerimeter = 4 * side;
        System.out.println("Square Area: " + squareArea);
        System.out.println("Square Perimeter: " + squarePerimeter);

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double rectArea = length * breadth;
        double rectPerimeter = 2 * (length + breadth);
        System.out.println("Rectangle Area: " + rectArea);
        System.out.println("Rectangle Perimeter: " + rectPerimeter);

        // Triangle (assuming right-angled for simplicity)
        System.out.print("\nEnter base of triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        double triArea = 0.5 * base * height;
        // Hypotenuse using Math.sqrt
        double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        double triPerimeter = base + height + hypotenuse;
        System.out.println("Triangle Area: " + triArea);
        System.out.println("Triangle Perimeter: " + triPerimeter);

        // Circle
        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        double circleCircumference = 2 * Math.PI * radius;
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Circumference: " + circleCircumference);

        sc.close();
    }
}



