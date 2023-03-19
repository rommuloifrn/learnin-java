package entities;

public class Employee {
	private int id;
	private String name;
	private double wage;
	
	
	public Employee() {
	}
	
	public Employee(int id, String name, double wage) {
		this.id = id;
		this.name = name;
		this.wage = wage;
	}
	
	public String toString() {
		return String.format("id %d: %s, R$ %f", id, name, wage);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setNome(String nome) {
		this.name = nome;
	}
	public double getWage() {
		return wage;
	}
	public void raiseWage(double raise) {
		wage = wage + raise*wage/100;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	
}
