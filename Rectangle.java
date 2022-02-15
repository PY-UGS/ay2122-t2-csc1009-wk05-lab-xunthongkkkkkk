
public class Rectangle extends Shape {

	private double area;
	
	public Rectangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	@Override
	public double area() {
		area = getDim1() * getDim2();
		return area;
	}
	
}
