package packageName;

public class Country {
	private String name;
	private CapitalCity capitalCity;
	
	public Country(String n, CapitalCity cc){
		name = n;
		capitalCity = cc;
	}
	CapitalCity cc1 = new CapitalCity("Paris", 2048000);
	CapitalCity cc2 = new CapitalCity("Tokyo", 14250000);
	CapitalCity cc3 = new CapitalCity("Cairo", 9900000);
	
	public String getName() {
		return name;
	}
	public CapitalCity getCapitalCity() {
		return capitalCity;
	}
	public void setName(String n) {
		name = n;
	}
	public void setCapitalCity(CapitalCity cc) {
		capitalCity = cc;
	}
	public boolean hasMegaCapitalCity() {
		return capitalCity.isMegaCity();
	}
	public String toString() {
		return "Country(Name=" + name + ", CapitalCity(Name=" + capitalCity.getName() + ", Population=" +  capitalCity.getPopulation() + "))";
	}
}
