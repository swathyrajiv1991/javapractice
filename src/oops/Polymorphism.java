package oops;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = {
	            new Circle("Red", 5),
	            new Rectangle("Blue",4, 6),
	            new Triangle("Orange",2, 3, 3, 4, 5),
	            new Square("Green",3)
	        };
		
		for(Shape s: shapes) {
			s.displayInfo();
			
		}
		
		

	}

}


class Shape{
	String color;
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	public double  area() {
		return 0;
		
	}
	public double perimeter() {
		return 0;
	}
	public void displayInfo() {
		System.out.println("Color: " + color);
		System.out.println("Area: " + area());
		System.out.println("Perimeter: " + perimeter());
		
	}

}
class Circle extends Shape{
	int radius;

	

	public Circle(String color, int radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*Math.PI*radius;
	}
}
	class Rectangle extends Shape{
		int height;
		int width;
		public Rectangle(String color,int height, int width) {
			super(color);
			this.height = height;
			this.width = width;
		}
		@Override
		public double  area() {
			return height*width;
			
		}
		@Override
		public double perimeter() {
			return 2*(height+width);
		}
	}

	class Triangle extends Shape{
		int side1;
		int  side2;
		int side3;
		public Triangle(String color,int side1, int side2, int side3, int height, int base) {
			super(color);
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			this.height = height;
			this.base = base;
		}
		int height;
		int base;
		@Override
		public double area() {
			// TODO Auto-generated method stub
			return .5*height*base;
		}
		@Override
		public double perimeter() {
			// TODO Auto-generated method stub
			return side1+side2+side3;
		}
		
	}
	

	class Square extends Rectangle {

	    public Square(String color, int side) {
	        super(color, side, side); // ✅ key requirement
	    }
	}