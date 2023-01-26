package patterns.design.creational_patterns.prototype;

public class Circle extends Shape{
	public int radius;

	public Circle(){
		super();
	}

	public Circle(Circle shape) {
		super(shape);
		this.radius = shape.radius;
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
