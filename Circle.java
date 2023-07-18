package july7Assignment;
import java.util.Scanner;

public class Circle {
	static double radius;
	static double pi = 3.14;
	public static void area() {
		System.out.println("The area of circle is");
		double circArea = pi * radius * radius;
		System.out.println(circArea);
		
	}
	public static void circumference() {
		System.out.println("The circumfrence of circle is");
		double circCircum = 2* pi* radius;
		System.out.println(circCircum);
		
	}

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the radius of the circle");
	radius = sc.nextDouble();
			area();
			circumference();

	}

}
