
public class Ellipse extends Shape {

	private double area;
	
	public Ellipse(double dim1, double dim2){
		super(dim1, dim2);
	}

	@Override
	public double area() {
		area = getDim1() * getDim2() * getPI();
		return area;
	}
	
}
