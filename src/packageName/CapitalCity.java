package packageName;

public class CapitalCity {
	private String name;
	private int population;
	
	public CapitalCity(String n, int pop) {
		name = n;
		population = pop;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setPopulation(int p) {
		population = p;
	}
	public int getPopulation() {
		return population;
	}
	public boolean isMegaCity() {
		if (population > 10000000) {
			return true;
		}
		return false;
	}
	public String toString(String n) {
		return "CapitalCity(Name=" + name + ", Population=" + population + ")";
	}
}
