package test_0308;

public class TriangleExam {
	 public static void main(String[] args) {
	     Triangle triangle1 = new Triangle(10.2, 17.3);
	     System.out.println("삼각형1의 넓이: " + triangle1.getArea());
	     
	     triangle1.setBase(7.5);
	     triangle1.setHeight(9.2);
	     System.out.println("삼각형2의 넓이: " + triangle1.getArea());
	 }
	}
