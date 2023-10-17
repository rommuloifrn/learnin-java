package s14_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class MetodosAbstratos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Shape> arr = new ArrayList<Shape>();
		
		System.out.println("number of shapes;");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("shape #%d data:\n", i);
			System.out.println("rectangle or circle? (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.println("color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.println("width:");
				double width = sc.nextDouble();
				System.out.println("height:");
				double height = sc.nextDouble();
				arr.add(new Rectangle(color, width, height));
			} else {
				System.out.println("radius:");
				double radius = sc.nextDouble();
				arr.add(new Circle(color, radius));
			}
			
			
		}
		
		System.out.println();
		System.out.println("shape areas:");
		for ( Shape shape : arr) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
