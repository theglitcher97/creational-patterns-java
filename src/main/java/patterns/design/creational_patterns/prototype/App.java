package patterns.design.creational_patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static List<Shape> shapes = new ArrayList<>();
	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.setX(10);
		circle.setY(10);
		circle.radius = 20;
		shapes.add(circle);

		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);

		Rectangle rectangle = new Rectangle();
		rectangle.height = 20;
		rectangle.width = 10;
		shapes.add(rectangle);
	}
}
