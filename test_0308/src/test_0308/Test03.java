package test_0308;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int radius = scan.nextInt();
		Circle c  = new Circle(radius);
		System.out.println(c.Area());
	}

}

class Circle{
	int radius;
	public Circle() {}
	public Circle(int radius) {
		this.radius = radius;
	}
	public double Area() {
		return radius*radius*3.14;
	}
	
	
}