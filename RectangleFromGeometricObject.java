public class RectangleFromGeometricObject extends GeometricObject{

	private double width;
	private double height;
	
	public RectangleFromGeometricObject() {
		
	}

	public RectangleFromGeometricObject(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public RectangleFromGeometricObject(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		double area = this.width * this.height;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = (this.width + this.height) * 2;
		return perimeter;
	}
	
}
