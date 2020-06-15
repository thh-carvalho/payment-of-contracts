package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.services.Paypal;
import model.services.calculateInstallments;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.println("Contract value: ");
		double amount = sc.nextDouble();
		
		Contract contract = new Contract(number, date, amount);
		
		System.out.println("Enter number of installments: ");
		int numberInstalments = sc.nextInt();
		
		calculateInstallments calcInstall = new calculateInstallments(numberInstalments, new Paypal());
		calcInstall.CalculateInstallments(contract);
		calcInstall.CalculatePayment(contract);
		
		System.out.println(contract);
	}

}
