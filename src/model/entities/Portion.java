package model.entities;

import java.util.Date;

public class Portion {
	
	private Double installment;
	private Date date;
	
	public Portion() {
	}

	public Double getInstallments() {
		return installment;
	}

	public void setInstallments(Double installment) {
		this.installment = installment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
