package patterns.design.creational_patterns.abstract_factory.helmetFactory;
 public class HelmetFactory {
	private HelmetFactory(){}

	public static Helmet createHelmet(HelmetType helmetType){
		switch (helmetType){
			case Iron -> { return new IronHelmet(); }
			case Golden -> { return new GoldenHelmet(); }
			default -> { return null; }
		}
	}
}
