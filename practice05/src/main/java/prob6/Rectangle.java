package prob6;

public class Rectangle extends Shape implements Resizable{
	
	public Rectangle(double x, double y) {
		super(x,y);
	}
	@Override
	double getArea() {
		return x*y;
	}

	@Override
	double getPerimeter() {
		return 2*(x+y);
	}
	@Override
	public void resize(double s) {
		x*=s;
		y*=s;		
	}

}
