
public class CircleFromGeometricObject extends GeometricObject{

	private double radius;
	
	public CircleFromGeometricObject() {
		
	}

	public CircleFromGeometricObject(double radius) {
		this.radius = radius;
	}

	public CircleFromGeometricObject(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		double area = this.radius * this.radius * 3.14159;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 2 * 3.14159 * this.radius;
		return perimeter;
	}
	
	public double getDiameter() {
		double diameter = 2 * this.radius;
		return diameter;
	}
	
	public void printCircle() {
		System.out.println("created on " + this.getDateCreated());
	}
}
