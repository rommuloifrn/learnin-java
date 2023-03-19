import java.util.Scanner;
import entities.Room;

public class ProgramPensionato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao pensionato! Quantos estudantes iremos abrigar hoje?");
		int quantidade = sc.nextInt();
		Room[] rooms = new Room[10];
		for (int i=0; i<10; i++) {rooms[i] = new Room();}
		
		for (int i=1; i<=quantidade; i++) {
			System.out.printf("Digite o nome do estudante %d:%n", i);
			sc.nextLine();
			String studentName = sc.nextLine();
			System.out.println("Agora digite o email do estudante:");
			String studentEmail = sc.next();
			System.out.printf("E o quarto que ele quer ocupar, entre os seguintes: ");
			for(i=0; i<10; i++) {
				if (rooms[i].isOccupied() == false) {
					System.out.printf("%d, ", i);
				}
			}
			System.out.println();
			
			int studentRoom = sc.nextInt();
			if (rooms[studentRoom].isOccupied() == true) {System.out.println("Esse quarto já está ocupado, panaca!"); break;}
			rooms[studentRoom] = new Room(studentName, studentEmail);
		}
		
		System.out.println("Relação dos quartos:");
		for (int i=0; i<quantidade; i++) {
			System.out.printf("quarto %d: %s%n", i, rooms[i].toString());
		}
		
		
		sc.close();
	}
}
