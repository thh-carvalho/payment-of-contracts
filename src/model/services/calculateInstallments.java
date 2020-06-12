package model.services;

import model.entities.Contract;
import model.entities.Portion;

public class calculateInstallments {
	
	private Integer numberInstalments;
	private double installmentsValue;
	private Portion portion;
	
	private Payment payment;
	
	public calculateInstallments() {
	}

	public calculateInstallments(Integer numberInstalments, Payment payment) {
		this.numberInstalments = numberInstalments;
		this.payment = payment;
	}
	
	public void CalculateInstallments(Contract contract) {
		installmentsValue = contract.getAmount() / numberInstalments;
	}
	
	public void CalculatePayment(Contract contract) {
		for(int i = 0; i < 3; i++) {
			contract.addPortion(payment.tax(portion, installmentsValue, i));
		}
	}
	
}
