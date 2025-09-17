package packageName;

public class MonsterRunner {

	public static void main(String[] args) {
		Monster m1 = new Monster("Fang", "Fire", 7);
		Monster m2 = new Monster("Misty", "Water", 4);
		System.out.println(m1);
		System.out.println(m2);
		m1.equals(m1, m2);
		m1.basicBattle(m1, m2);
		m1.typeBattle(m1, m2);
		boolean null1 = false;
		boolean null2 = false;
		if (m1 == null) {
			null1 = true;
		}
		if (m2 == null) {
			null2 = true;
		}
		/*IDK if you wanted me to do something for the null checkers and for the file, I tested them all
		out individually by printing them without the overridden toString message
		(we haven't learned file stuff right??) (also the code is supposed to be dead) */
		
	}

}
