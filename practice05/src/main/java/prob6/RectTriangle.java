package prob6;

public class RectTriangle extends Shape{

	public RectTriangle(double x, double y) {
		super(x,y);
	}
	@Override
	double getArea() {
		return x*y/2;
	}

	@Override
	double getPerimeter() {
		return x + y + Math.pow((Math.pow(x,2) + Math.pow(y,2)),0.5);
	}

}
