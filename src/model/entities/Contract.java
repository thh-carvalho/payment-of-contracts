package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer number;
	private Date date;
	private Double amount;
	
	private List<Portion> portions = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, Date date, Double amount) {
		this.number = number;
		this.date = date;
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
	
	
}
