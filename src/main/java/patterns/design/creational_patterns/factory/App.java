package patterns.design.creational_patterns.factory;

import patterns.design.creational_patterns.factory.concrete_swords.Sword;
import patterns.design.creational_patterns.factory.enums.SwordType;

public class App {
	public static void main(String[] args) {
		Sword woodenSword = SwordFactory.createSword(SwordType.Wooden);
		Sword ironSword = SwordFactory.createSword(SwordType.Iron);

		if(woodenSword != null){ testSword(woodenSword);}
		if(ironSword != null){testSword(ironSword);}
	}

	public static void testSword(Sword sword){
		System.out.println();
		System.out.println("Current damage " + sword.getDamage());
		sword.attack();
	}
}
