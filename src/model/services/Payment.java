package model.services;

import model.entities.Portion;

public interface Payment {
	
	Portion tax(Portion portion, double amount, int mounth);

}
