package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total shapes area: " + totalArea(myShapes));
		
		List<Circle> myCircles = new ArrayList<>();
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total circles area: " + totalArea(myShapes));
	}
	
	public static double totalArea(List<? extends Shape> list) {
		// ? extends Shape significa que esse metodo pode ser de um tipo shape ou qualquer subtipo de shape
		// nao posso adicionar nenhum elemento nessa lista, uma vez que o tipo que eu tentar adicionar pode nao ser o tipo dessa lista
		double sum = 0.0;
		for(Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}
