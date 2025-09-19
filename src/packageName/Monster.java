package packageName;

public class Monster {
	private String name;
	private String type;
	private int level;
	
	public Monster(String n, String t, int l) {
		name = n;
		type = t;
		level = l;
	}
	public Monster(String n, String t) {
		name = n;
		type = t;
		level = 1;
	}
	
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public int getLevel() {
		return level;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setType(String t) {
		type = t;
	}
	public void setLevel(int l) {
		level = l;
	}
	
	public Monster basicBattle(Monster m1, Monster m2) {
		if (getLevel() >= m2.getLevel()) {
			return m1;
		}
		return m2;
	}
	public Monster typeBattle(Monster m1, Monster m2) {
		if (getType().equals("Fire") && m2.getType().equals("Water")) {
			return m1;
		}
		if (getType().equals("Fire") && m2.getType().equals("Earth")) {
			return m2;
		}
		if (getType().equals("Earth") && m2.getType().equals("Water")) {
			return m2;
		}
		if (getType().equals("Earth") && m2.getType().equals("Fire")) {
			return m1;
		}
		if (getType().equals("Water") && m2.getType().equals("Earth")) {
			return m1;
		}
		if (getType().equals("Water") && m2.getType().equals("Fire")) {
			return m2;
		}
		return m1;
	}
	
	public String toString() {
		return "Monster(Name=" + getName() + ", Type=" + getType() + ", Level=" + getLevel() + ")";
	}
	public boolean equals(Monster m2) {
		if (getType().equals(m2.getType()) && getName().equals(m2.getName())) {
			return true;
		}
		return false;
	}
}
