import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		
		// Options
		
		System.out.println("1 Dollar");
		System.out.println("2 Euro");
		System.out.println("3 Ruppe");
		System.out.println("4 Yen");
		System.out.println("5 Pound");
		
		// Input
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose A Currency");
		int choice = sc.nextInt();
		System.out.println("Enter the Amount");
		double amount = sc.nextDouble();
		
		// Converter
		
		switch (choice) {
		case 1:
			Dol_to(amount);
			break;
		case 2:
			Eur_to(amount);
			break;
		case 3:
			Rup_to(amount);
			break;
		case 4:
			Yen_to(amount);
			break;
		case 5:
			Pou_to(amount);
			break;
		default:
			System.out.println("Invalid Choice");
		}

	}
	
	public static void Dol_to(double amount) {
		// Dollars to Euros
		System.out.println(amount + " Dollars = " + (amount*0.91) + " Euros");
		System.out.println();
		
		// Dollars to Rupees
		System.out.println(amount + " Dollars = " + (amount*83.26) + " Rupees");
		System.out.println();
		
		// Dollars to Yen
		System.out.println(amount + " Dollars = " + (amount*140.00) + " Yen");
		System.out.println();
		
		// Dollars to Pounds
		System.out.println(amount + " Dollars = " + (amount*0.79) + " Pounds");
		System.out.println();
		
	}
	public static void Eur_to(double amount) {
		// Euros to Dollars
		System.out.println(amount + " Euros = " + (amount*1.10) + " Dollars");
		System.out.println();
				
		// Euros to Rupees
		System.out.println(amount + " Euros = " + (amount*91.55) + " Rupees");
		System.out.println();
				
		// Euros to Yen
		System.out.println(amount + " Euros = " + (amount*157.00) + " Yen");
		System.out.println();
				
		// Euros to Pounds
		System.out.println(amount + " Euros = " + (amount*0.87) + " Pounds");
		System.out.println();
		
	}
	public static void Rup_to(double amount) {
		// Rupees to Dollars
		System.out.println(amount + " Rupees = " + (amount*0.01) + " Dollars");
		System.out.println();
				
		// Rupees to Euros
		System.out.println(amount + " Rupees = " + (amount*0.01) + " Euros");
		System.out.println();
				
		// Rupees to Yen
		System.out.println(amount + " Rupees = " + (amount*2) + " Yen");
		System.out.println();
				
		// Rupees to Pounds
		System.out.println(amount + " Rupees = " + (amount*0.01) + " Pounds");
		System.out.println();
		
	}
	public static void Yen_to(double amount) {
		// Yen to Dollars
		System.out.println(amount + " Yen = " + (amount*0.01) + " Dollars");
		System.out.println();
				
		// Yen to Euros
		System.out.println(amount + " Yen = " + (amount*0.01) + " Euros");
		System.out.println();
				
		// Yen to Rupees
		System.out.println(amount + " Yen = " + (amount*0.58) + " Rupees");
		System.out.println();
			
		// Yen to Pounds
		System.out.println(amount + " Yen = " + (amount*0.01) + " Pounds");
		System.out.println();
	
	}
	public static void Pou_to(double amount) {
		// Pounds to Dollars
		System.out.println(amount + " Pounds = " + (amount*1.27) + " Dollars");
		System.out.println();
				
		// Pounds to Euros
		System.out.println(amount + " Pounds = " + (amount*1.15) + " Euros");
		System.out.println();
				
		// Pounds to Rupees
		System.out.println(amount + " Pounds = " + (amount*105.63) + " Rupees");
		System.out.println();
				
		// Pounds to Yen
		System.out.println(amount + " Pounds = " + (amount*181.004
				) + " Yen");
		System.out.println();
	
	}

}
