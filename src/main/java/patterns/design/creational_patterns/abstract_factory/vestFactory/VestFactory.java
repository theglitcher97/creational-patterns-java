package patterns.design.creational_patterns.abstract_factory.vestFactory;

public class VestFactory {
	private VestFactory(){}

	public static Vest createVest(VestType helmetType){
		switch (helmetType){
			case Iron -> { return new IronVest(); }
			case Golden -> { return new GoldenVest(); }
			default -> { return null; }
		}
	}
}
