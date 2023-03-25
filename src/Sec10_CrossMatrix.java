import java.util.Scanner;

public class Sec10_CrossMatrix {
	/* Esse programa lê altura, largura e elementos de uma matriz, um valor que esteja nela e depois mostra
	 * os elementos acima, abaixo, à esquerda e à direita do valor inserido. */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Digite a altura e a largura da matriz:");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] matrix = new int[m][n];
		
		System.out.println("Agora digite os elementos da matriz:");
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("E um número que esteja nela:");
		int num = sc.nextInt();
		
		System.out.println("A matriz:");
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
		
		for (int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				if (matrix[i][j] == num) {
					if (i > 0) {
						System.out.printf("Acima: %d%n", matrix[i-1][j]);
					}
					if (i < m-1) {
						System.out.printf("Abaixo: %d%n", matrix[i+1][j]);
					}
					if (j > 0) {
						System.out.printf("Esquerda: %d%n", matrix[i][j-1]);
					}
					if (j < n-1) {
						System.out.printf("Direita: %d%n", matrix[i][j+1]);
					}
				}
			}
		}
		
		sc.close();
	}
}


