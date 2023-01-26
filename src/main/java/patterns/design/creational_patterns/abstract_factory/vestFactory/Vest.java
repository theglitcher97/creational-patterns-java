package patterns.design.creational_patterns.abstract_factory.vestFactory;

public abstract class Vest {
	private int levelOfDefense;


	public Vest(int defense){
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
