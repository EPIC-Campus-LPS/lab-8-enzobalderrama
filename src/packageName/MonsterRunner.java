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
		if (m2 == null) {
			System.out.println("Monster 2 IS null");
		}
		Monster bestMonster = null;
		File file = new File("monsters.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            String weird = sc.nextLine();
            String[] dumbarray = null;
        	for (int i = 0; i < weird.length()-2; i++) {
        		dumbarray = weird.split(",");
        	}
            int inty = sc.nextInt();
            Monster m3 = new Monster(dumbarray[0], dumbarray[1], inty);
            
            String weirder = sc.nextLine();
            String[] dumberarray = null;
        	for (int i = 0; i < weirder.length()-2; i++) {
        		dumberarray = weirder.split(",");
        	}
            int integrity = sc.nextInt();
            Monster m4 = new Monster(dumberarray[0], dumberarray[1], integrity);
            
            Monster m5 = m3.basicBattle(m3, m4);
            bestMonster = m5.basicBattle(m5, bestMonster);
        }
        sc.close();
        System.out.println(bestMonster);
	}

}
