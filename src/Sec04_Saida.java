import java.util.Locale;

public class Sec04_Saida {
// Exercício de saída, primeiras aulas
	public static void main(String[] args) {
		System.out.print("Olá, bicho. Não vou quebrar essa linha.");
		System.out.println(" Mas aqui eu vou.");
		int mynum;
		mynum = 0;
		double x = 3.1412345;
		String palavrinha = "ximbas";
		
		System.out.println(mynum);
		// printf, semelhante ao do C. Aqui o %n faz a quebra de linha, na formatação.
		System.out.printf("%.3f%n",x);
		
		/* Esta cacimba define a localização para US, o que impacta, até agora, em se a casa decimal
		 * vai ser separada por um ponto ou por uma vírgula. */ 
		Locale.setDefault(Locale.US);
		System.out.printf("%.5f%n",x);
		
		// Concatenação com println
		System.out.println("o valor da minha primeira var é " + mynum + ", e o da segunda é " + x + ".");
		
		/* Concatenação com printf / marcadores: 
		 * %f pra double
		 * %d pra inteiro
		 * %s pra texto
		 * %n quebra de linha */
		System.out.printf("uma mais a outra dá %f, %s.%n", mynum + x, palavrinha);
		
	}

}
