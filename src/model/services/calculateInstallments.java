package model.services;

import model.entities.Contract;
import model.entities.Portion;

public class calculateInstallments {
	
	private Integer numberInstalments;
	private double installmentsValue;
	private Contract contract;
	
	private Payment payment;
	private Portion installment;
	
	public calculateInstallments() {
	}

	public calculateInstallments(Integer numberInstalments, Payment payment) {
		this.contract = contract;
		this.numberInstalments = numberInstalments;
		this.payment = payment;
	}
	
	public void CalculateInstallments(Contract contract) {
		installmentsValue = contract.getAmount() / numberInstalments;
	}
	
	public void CalculatePayment(Contract contract) {
		for(int i = 0; i < 3; i++) {
			contract.addPortion(payment.tax(installment, installmentsValue, i));
		}
	}
	
}
