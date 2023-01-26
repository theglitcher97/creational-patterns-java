package patterns.design.creational_patterns.abstract_factory.helmetFactory;

public abstract class Helmet {
	private int levelOfDefense;


	public Helmet(int defense){
		this.levelOfDefense = defense;
	}

	public void getDamage(int damage){
		this.levelOfDefense -= damage;
	}

	public int getLevelOfDefense() {
		return levelOfDefense;
	}

	public void setLevelOfDefense(int levelOfDefense) {
		this.levelOfDefense = levelOfDefense;
	}
}
