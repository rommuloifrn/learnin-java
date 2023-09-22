package s10_listas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Sec10_Employees {
	// Mais um exercício de listas
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Digite o número de funcionários:");
		int employeesAmount = sc.nextInt();
		
		for (int i=1; i<=employeesAmount; i++) {
			/* Essa minha versão do programa não precisa de verificação de ID, pois ele é definido pelo próprio laço for. */
			System.out.printf("Insira o nome do funcionário %d:", i);
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Agora o salário:");
			double salary = sc.nextDouble();
			employees.add(new Employee(i, name, salary));
		}
		
		listEmployees(employees);
		
		System.out.println("Agora vamos fazer um aumento em algum funcionário. Digite um ID:");
		int id = sc.nextInt();
		/* A linha abaixo faz um ponteiro para o empregado cujo id foi digitado. */
		Employee lucky = employees.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (lucky != null) {
			System.out.println("E o aumento de salário: (em porcentagem)");
			double raise = sc.nextDouble();
			lucky.raiseWage(raise);
		} else {
			System.out.println("O funcionário com esse ID não existe :c");
		}
		listEmployees(employees);
		
		
		sc.close();
	}
	
	
	public static void listEmployees(List<Employee> employees) {
		System.out.println("-------------------------------");
		for (Employee employee : employees) {
			System.out.printf("#%d: %s %.2f%n", employee.getId(), employee.getName(), employee.getWage());
		}
		System.out.println("-------------------------------");
	}
}

