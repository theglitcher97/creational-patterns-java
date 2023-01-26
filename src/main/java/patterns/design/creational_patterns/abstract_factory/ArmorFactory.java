package patterns.design.creational_patterns.abstract_factory;

import patterns.design.creational_patterns.abstract_factory.helmetFactory.Helmet;
import patterns.design.creational_patterns.abstract_factory.helmetFactory.HelmetFactory;
import patterns.design.creational_patterns.abstract_factory.helmetFactory.HelmetType;
import patterns.design.creational_patterns.abstract_factory.vestFactory.Vest;
import patterns.design.creational_patterns.abstract_factory.vestFactory.VestFactory;
import patterns.design.creational_patterns.abstract_factory.vestFactory.VestType;

public class ArmorFactory {
	private ArmorFactory(){}

	public static Helmet createArmor(HelmetType helmetType){
		return HelmetFactory.createHelmet(helmetType);
	}

	public static Vest createArmor(VestType vestType){
		return VestFactory.createVest(vestType);
	}
}
