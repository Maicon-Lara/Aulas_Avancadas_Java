package entities;

public class Individual extends TaxPayer {

	private Double healthExpeditures;

	public Individual() {

	}

	public Individual(String name, Double anualIncome, Double healthExpeditures) {
		super(name, anualIncome);
		this.healthExpeditures = healthExpeditures;
	}

	public Double getHealthExpeditures() {
		return healthExpeditures;
	}

	public void setHealthExpeditures(Double healthExpeditures) {
		this.healthExpeditures = healthExpeditures;
	}

	@Override
	public Double tax() {
		return (getAnualIncome()* 0.25) - (getHealthExpeditures() * 0.5);
	}

}
