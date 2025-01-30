package com.AbsInter;
abstract class Shape{
	void calculateArea() {
		System.out.println("Area:");
	}
}
class Rectangle extends Shape{
	void calculateArea() {
		int length=4;
		int breadth=6;
		int area;
		area=length*breadth;
		System.out.println("Area of Rectangle:"+area);

	}
}
class Triangle extends Shape{
	 void calculateArea() {
		int height=9;
		int breadth = 3;
		int area;
		area=(height*breadth)/2;
		System.out.println("Area of Triangle :"+area);

	}
}
//interface.. not relate to anything
class DrawShape{
	DrawShape(Shape s){
	s.calculateArea();
	}
}
public class Area {

	public static void main(String[] args) {
		
		

	Triangle tri=new Triangle();
		Rectangle rec=new Rectangle();
		DrawShape draw=new DrawShape(rec);
		DrawShape dr=new DrawShape(tri);

		
		

	}

}
