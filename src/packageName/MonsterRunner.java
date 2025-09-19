package packageName;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class MonsterRunner {

	public static void main(String[] args) throws IOException {
		Monster m1 = new Monster("Fang", "Fire", 7);
		Monster m2 = new Monster("Misty", "Water", 4);
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m1.equals(m2));
		System.out.println(m1.basicBattle(m1, m2));
		System.out.println(m1.typeBattle(m1, m2));
		boolean null1 = false;
		boolean null2 = false;
		if (m1 == null) {
			System.out.println("Monster 1 IS null");
		}
		else {
			System.out.println("Monster 1 is NOT null");
		}
		if (m2 == null) {
			System.out.println("Monster 2 IS null");
		}
		else {
			System.out.println("Monster 2 is NOT null");
		}
		Monster bestMonster = null;
		File file = new File("monsters.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String weird = sc.nextLine();
            String[] dumbarray = null;
        	for (int i = 0; i < weird.length(); i++) {
        		dumbarray = weird.split(", ");
        	}
            Monster m3 = new Monster(dumbarray[0], (dumbarray[1]), Integer.valueOf(dumbarray[2].strip()));
            
            String weirder = sc.nextLine();
            String[] dumberarray = null;
        	for (int i = 0; i < weirder.length(); i++) {
        		dumberarray = weirder.split(", ");
        	}
        	Monster m4 = new Monster(dumberarray[0], dumberarray[1], Integer.valueOf(dumberarray[2].strip()));
        	System.out.println(m4);
        	Monster m5 = m3.basicBattle(m3, m4);
            bestMonster = m5.basicBattle(m5, bestMonster);
        }
        sc.close();
        System.out.println(bestMonster);
	}

}
