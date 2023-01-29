import java.util.Scanner;

public class CarFacts {	
    public static void main(String[] args) {
		double priceofnewcar;
		double milesdrivenperyear;
		double estimatedgasprice;
		double milespergallon;
		double resalevalue;
        String accident = "";
		final double YEARS_OWNED = 5;
	
		try (Scanner keyboard = new Scanner (System.in)) {
			System.out.println("Input price of new car: ");
			priceofnewcar = keyboard.nextDouble();
			System.out.println("Input miles driven per year: ");
			milesdrivenperyear = keyboard.nextDouble();
			System.out.println("Input estimated gas price for full tank: ");
			estimatedgasprice = keyboard.nextDouble();
			System.out.println("Input miles per gallon: ");
			milespergallon = keyboard.nextDouble();
			System.out.println("Input resale value: ");
			resalevalue = keyboard.nextDouble();
            System.out.println("Has this car ever been in an accident?");
            accident = keyboard.next();
            if (accident.toLowerCase().equals("yes")) {
                resalevalue = resalevalue / 2;
            }
		}
	
		double costofgas;
		costofgas = milesdrivenperyear / milespergallon * estimatedgasprice * YEARS_OWNED;
		double totalcostofcar;
		totalcostofcar = priceofnewcar + costofgas - resalevalue;
		System.out.printf("Total cost of owning car for 5 years: %.2f %n", totalcostofcar);
	}
	
}