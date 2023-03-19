import java.util.Scanner;

public class ProgramArray {
	public static void main(String[] args) {
		// ctrl shift o = resolve erro
		Scanner sc = new Scanner(System.in);
		System.out.println("Ximpa você pé!");
		
		int quantidade = sc.nextInt();
		int[] marrai = new int[quantidade];
		
		for (int i=0; i<quantidade; i++) {
			System.out.printf("digite o elemento %d:%n", i);
			marrai[i] = sc.nextInt();
		}
		System.out.println("Números negatinhos:");
		for (int i=0; i<quantidade; i++) {
			if (marrai[i] <0) {
				System.out.println(marrai[i]);
			}
		}
		
		sc.close();
	}
}
