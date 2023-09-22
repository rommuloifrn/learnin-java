package s06_repetitivas;

public class Sec06_ForEach {
	public static void main(String[] args) {
		String[] marrai = new String[] {"Todo dia tem um maluc", "aaaa gatinhos", "reh reh reh"};
		
		for (String item : marrai) {
			System.out.printf("%s!!!!!!%n", item);
		}
	}
}
