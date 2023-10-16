package s14_heranca_polimorfismo;

import java.util.Locale;
import java.util.Scanner;

import entities.enums.Color;

public class MetodosAbstratos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("number of shapes;");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.printf("shape #%d data:\n", i);
			System.out.println("rectangle or circle? (r/c)?");
			char ch = sc.next().charAt(0);
			System.out.println("color (BLACK/BLUE/RED):");
			Color color = Color.valueOf(sc.next());
			
			
		}
		
		sc.close();
	}

}
