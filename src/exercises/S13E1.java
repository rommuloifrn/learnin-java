package exercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class S13E1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter worker name:");
		String name = sc.next();
		System.out.println("enter worker level:");
		String level = sc.next();
		System.out.println("enter worker salary:");
		Double salary = sc.nextDouble();
		System.out.println("enter worker department:");
		String department = sc.next();
		Department dep = new Department(department);
		
		
		
		
		Worker zezin = new Worker(name, WorkerLevel.valueOf(level), salary, dep);
		
		System.out.println("enter number of contracts:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("enter contract "+i+" date:");
			LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.println("enter the value per hour of the contract " + i + ":");
			Double value = sc.nextDouble();
			System.out.println("enter the duration (int hours) of contract " + i + ":");
			Integer hours = sc.nextInt();
			zezin.addContract(new HourContract(date, value, hours));
		}
		
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String[] monthString = sc.next().split("/");
		int month = Integer.valueOf(monthString[0]);
		int year = Integer.valueOf(monthString[1]);
		
		System.out.printf("Name: %s\n department: %s\n income on %d/%d: %.2f", zezin.getName(), zezin.getDepartment(), month, year, zezin.income(year, month));
		
		
		
		sc.close();
	}
}
