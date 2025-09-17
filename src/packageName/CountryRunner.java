package packageName;

public class CountryRunner {

	public static void main(String[] args) {
		CapitalCity cc1 = new CapitalCity("Paris", 2048000);
		CapitalCity cc2 = new CapitalCity("Tokyo", 14250000);
		CapitalCity cc3 = new CapitalCity("Cairo", 9900000);
		
		Country c1 = new Country("France", cc1);
		Country c2 = new Country("Japan", cc2);
		Country c3 = new Country("Egypt", cc3);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
