package quiz20;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(String name,int radius) {
		super(name);
		this.radius = radius;
	}


	public double getArea() {

		return radius*radius*Math.PI;
	}

	
}
