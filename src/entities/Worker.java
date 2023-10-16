package entities;

import java.time.LocalDate;
import java.util.ArrayList;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private ArrayList<HourContract> contracts;
	private Department department;
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.contracts = new ArrayList<HourContract>();
		this.department = department;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void remove(HourContract contract) {
		contracts.remove(contract);
	}
	
	public Double income(Integer year, Integer month ) {
		Double total = baseSalary;
		for (int i=0; i<contracts.size(); i++) {
			HourContract contract = contracts.get(i);
			LocalDate contractDate = contract.getDate();
			if ( (contractDate.getYear() == year) && (contractDate.getMonthValue() == month) ) {
				total += contract.totalValue();
			}
		}
		return total;
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public ArrayList<HourContract> getContracts() {
		return contracts;
	}

	public void setContracts(ArrayList<HourContract> contracts) {
		this.contracts = contracts;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
