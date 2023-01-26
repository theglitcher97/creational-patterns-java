package patterns.design.creational_patterns.factory;

import java.util.List;

public abstract class Sword {
	private Integer damage;
	private List<String> enchants;
	public abstract Integer attack();
	public abstract void adjustAttackDamage();
	public abstract void addEnchanted(String enchant);
	public abstract void removeEnchanted(String enchant);
}
