
public class Triangle extends Shape{

	private double area;
	
	public Triangle(double dim1, double dim2){
		super(dim1, dim2);
	}

	@Override
	public double area() {
		area = (getDim1() * getDim2()) / 2;
		return area;
	}
	
}
