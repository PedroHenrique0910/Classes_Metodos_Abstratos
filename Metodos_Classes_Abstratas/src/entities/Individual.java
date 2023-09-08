package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double Tax() {
	    if (getAnualIncome() >= 20.000 && healthExpenditures > 0) {
	        return (getAnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
	    } else if (healthExpenditures <= 0 && getAnualIncome() >= 20.000) {
	        return getAnualIncome() * 25 / 100;
	    } else if (getAnualIncome() < 20.000 && healthExpenditures > 0) {
	        return (getAnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
	    } else {
	        return getAnualIncome() * 15 / 100;
	    }
	}
}
