package entities;

public class OutsourcedEmployee extends Employee2 {
	
	private Double additionalCharge;


	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour) {
		super(name, hours, valuePerHour);
		this.additionalCharge = (hours*valuePerHour)*0.10;
		
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return valuePerHour*hours+additionalCharge;
	}
}
