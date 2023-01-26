package patterns.design.creational_patterns.abstract_factory;

import patterns.design.creational_patterns.abstract_factory.helmetFactory.Helmet;
import patterns.design.creational_patterns.abstract_factory.helmetFactory.HelmetType;
import patterns.design.creational_patterns.abstract_factory.vestFactory.Vest;
import patterns.design.creational_patterns.abstract_factory.vestFactory.VestType;

public class App {
	public static void main(String[] args) {
		Helmet ironHelmet = ArmorFactory.createArmor(HelmetType.Iron);
		Vest goldenVest = ArmorFactory.createArmor(VestType.Golden);

		System.out.println("ironHelmet level of defense: "+ironHelmet.getLevelOfDefense());
		System.out.println("goldenVest level of defense: "+goldenVest.getLevelOfDefense());
	}
}
