
abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

class Circle extends Shape {
	double r;
	
	Circle() {
		this(new Point(), 0);
	}
	
	Circle(Point p, double r) {
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * 3.14;
	}
	
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle() {
		this(new Point(), 0, 0);
	}
	
	Rectangle(Point p, double width, double height) {
		super(p);
		this.width = width;
		this.height = height;
	}
	
	boolean isSquare() {
		if (width == height) {
			return true;
		}
		return false;
	}

	@Override
	double calcArea() {
		return width * height;
	}
}


public class Exercise7_22 {

	public static void main(String[] args) {
		Shape s = new Circle();
		
		Shape s2 = new Circle(new Point(10, 10), 10);
		System.out.println(s2.calcArea()); 
		
		Rectangle s3 = new Rectangle(new Point(), 45, 50);
		System.out.println(s3.calcArea()); 
		System.out.println(s3.isSquare());
	}

}
