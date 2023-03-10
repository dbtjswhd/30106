package test_0308;

//Triangle 클래스
public class Triangle {
 private double base; // 밑변
 private double height; // 높이
 
 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }
 
 public void setBase(double base) {
     this.base = base;
 }
 
 public void setHeight(double height) {
     this.height = height;
 }
 
 public double getArea() {
     return (base * height) / 2;
 }
}

//TriangleExam 클래스

