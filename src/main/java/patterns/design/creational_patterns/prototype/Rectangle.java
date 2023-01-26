package patterns.design.creational_patterns.prototype;

public class Rectangle extends Shape{
	public int width;
	public int height;

	public Rectangle(){}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
	}

	public Rectangle(Rectangle rectangle) {
		super(rectangle);
		this.width = rectangle.width;
		this.height = rectangle.height;
	}

	@Override
	public Shape clone() {
		return new Rectangle(this);
	}
}
