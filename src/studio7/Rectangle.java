package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double width;
	private double length;

	// constructor
	public Rectangle(double initwidth, double initlength)
	{
		width = initwidth;
		length = initlength;
	}


	public boolean isSquare() {
		if(width == length) {
			return true;
		}
		else return false;
	}

	public double area() {
		return width*length;
	}

	public double perimeter() {
		return (width+length)*0.5;
	}

	public void draw() {
		StdDraw.clear();
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, width/2, length/2);
	}

	public boolean isSmaller(Rectangle another) {

		if (another.area() > width*length) {
			return true;
		}
		else return false;
	}

	// test
	public static void main(String[] args) {
		Rectangle p1 = new Rectangle(0.7,0.8);
		System.out.println(p1.isSquare());
		System.out.println(p1.perimeter());
		p1.draw();

		Rectangle p2 = new Rectangle(0.5, 0.5);
		System.out.print(p1.isSmaller(p2));
	}

}