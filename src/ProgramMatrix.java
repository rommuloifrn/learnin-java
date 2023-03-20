import java.util.Scanner;

public class ProgramMatrix {
	// Exercício de matrizes
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira a ordem da matriz:");
		int order = sc.nextInt();
		int[][] matrix = new int[order][order];
		
		for (int i=0; i<matrix.length; i++) {
			for (int k=0; k<matrix[i].length; k++) {
				matrix[i][k] = sc.nextInt();
			}
		}
		
		System.out.println("---------[ Resultado: ]----------");
		
		for (int i=0; i<matrix.length; i++) {
			for (int k=0; k<matrix[i].length; k++) {
				System.out.printf("%d ",matrix[i][k]);
			}
			System.out.printf("%n");
		}
		
		System.out.println("Diagonal principal:");
		for(int i=0; i<order; i++) {
			System.out.printf("%d ", matrix[i][i]);
		}
		
		System.out.println();
		
		int negatives = 0;
		System.out.println("Quantidade de negativos: " + negatives);
		
		sc.close();
	}
}
