package model.services;

import model.entities.Portion;

public class Paypal implements Payment{

	@Override
	public Portion tax(Portion portion, double amount, int mounth) {
		double finalValue = (amount + 0.1)*mounth;
		finalValue = finalValue + 0.2;
		portion.setAmount(finalValue);
		return portion;
	}

}
