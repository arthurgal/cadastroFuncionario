package entities;

public class OutSourcedEmployee extends Employee {
	
	private Double additionalCharge;

	public OutSourcedEmployee() {
		super();
	}
	public OutSourcedEmployee(String name, Integer hours, Double valuePerHours, Double additionalCharge) {
		super(name, hours, valuePerHours);
		this.additionalCharge = additionalCharge;
	}
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	
	@Override
	public Double payment() {
		return super.payment() + this.additionalCharge * 1.1;
 	}
	
}
