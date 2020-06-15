package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double amount;
	private List<Portion> portions = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double amount) {
		this.number = number;
		this.date = date;
		this.amount = amount;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public List<Portion> getPortion() {
		return portions;
	}
	
	public void addPortion(Portion portion) {
		portions.add(portion);
	}
	
	public void removePortion(Portion portion) {
		portions.remove(portion);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(Portion p : portions) {
			int i = 1;
			sb.append("#"+ i + " Installment: R$");
			sb.append(p.getInstallments());
			sb.append("\n");
			i++;
		}
		return sb.toString();
	}
	
	
}
