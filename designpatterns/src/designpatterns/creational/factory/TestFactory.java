package designpatterns.creational.factory;

public class TestFactory {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 =factory.getShape("Rectangle");
		shape1.draw();
		
		Shape shape2 =factory.getShape("Circle");
		shape2.draw();
		
	}

}
