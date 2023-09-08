package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		
		double sum = 0;
		int n = sc.nextInt();	
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i' ) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of Employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));				
			}
	}
			System.out.println();
			System.out.println("TAXES PAID:");
			for (TaxPayer tp : list) {
				System.out.println(tp.getName() + ":" + String.format(" $ %.2f", tp.Tax()));
			}
			for (TaxPayer tp : list) {
				sum += tp.Tax();
			}
			System.out.println();
			System.out.printf("TOTAL TAXES: $ %.2f", sum);
		
		sc.close();
	}

}