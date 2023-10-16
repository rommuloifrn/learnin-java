package entities;

import entities.enums.Color;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		super();
	}
	
	

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * radius*radius;
	}
}
