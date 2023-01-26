package patterns.design.creational_patterns.factory;

import patterns.design.creational_patterns.factory.concrete_swords.IronSword;
import patterns.design.creational_patterns.factory.concrete_swords.Sword;
import patterns.design.creational_patterns.factory.concrete_swords.WoodenSword;
import patterns.design.creational_patterns.factory.enums.SwordType;

public class SwordFactory {
	private SwordFactory() {}
	public static Sword createSword(SwordType swordType){
		switch (swordType){
			case Wooden -> { return new WoodenSword(); }
			case Iron -> { return new IronSword(); }
			default -> { return null; }
		}
	}
}
