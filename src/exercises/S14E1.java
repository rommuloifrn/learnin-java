package exercises;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Employee2;
import entities.OutsourcedEmployee;

public class S14E1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee2> arr = new ArrayList<Employee2>();
		
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			Employee2 emp; boolean outsourced;
			System.out.printf("employee %d:\n", i+1);
			System.out.println("ousourced? (y/n)");
			if (sc.next().charAt(0) == 'y') outsourced = true; else outsourced = false;
			System.out.println("name:");
			String name = sc.next();
			System.out.println("hours:");
			int hours = sc.nextInt();
			System.out.println("value per hour:");
			Double value = sc.nextDouble();
			
			if (outsourced) {
				System.out.println("additional charge:");
				Double additionalCharge = sc.nextDouble();
				emp = new OutsourcedEmployee(name, hours, value, additionalCharge);
			} 
			else emp = new Employee2(name, hours, value);
			
			arr.add(emp);
		}
		
		System.out.printf("\n\n\nPAYMENTS:\n");
		for (Employee2 emp : arr) {
			System.out.printf("%s - $ %.2f\n", emp.getName(), emp.payment());
		}

		sc.close();
	}

}
