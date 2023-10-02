package exercises;

import java.time.LocalDate;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import enums.WorkerLevel;

public class S13E1 {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		Department contabilidade = new Department("contabilidade");
		Worker zezin = new Worker("zezin", WorkerLevel.MID_LEVEL, 2400.00, contabilidade);
		
		System.out.println("enter number of contracts:");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			LocalDate date = LocalDate.now();
			System.out.println("enter the value per hour of the contract " + i + ":");
			Double value = sc.nextDouble();
			System.out.println("enter the hours of contract " + i + ":");
			Integer hours = sc.nextInt();
			zezin.addContract(new HourContract(date, value, hours));
		}
		
		
		
	}
}
