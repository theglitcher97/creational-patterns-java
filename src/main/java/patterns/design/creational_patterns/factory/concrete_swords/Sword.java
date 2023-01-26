package patterns.design.creational_patterns.factory.concrete_swords;

import patterns.design.creational_patterns.factory.enums.EnchantType;

import java.util.ArrayList;
import java.util.List;

public abstract class Sword {
	private final Integer BASE_DAMAGE;
	private Integer damage;
	private List<EnchantType> enchants;

	Sword(Integer damage){
		this.BASE_DAMAGE = damage;
		this.damage = damage;
		this.enchants = new ArrayList<>();
	}
	public void attack(){
		System.out.println("Attacking...");
		System.out.println("Damage inflicted: "+this.getDamage());
	}
	public void adjustAttackDamage(){
		this.setDamage(getBASE_DAMAGE());
		this.getEnchants().forEach(enchantType -> {
			switch (enchantType){
				case EPIC -> this.setDamage(this.getDamage() + 5);
				case RARE -> this.setDamage(this.getDamage() + 3);
				case COMMON -> this.setDamage(this.getDamage() + 1);
				case WEAK -> this.setDamage(this.getDamage() - 2);
			}
		});
	}
	public void addEnchanted(EnchantType enchant){
		this.getEnchants().add(enchant);
		this.adjustAttackDamage();
	}
	public void removeEnchanted(EnchantType enchant){
		List<EnchantType> enchantTypeList = this.getEnchants();
		int index = enchantTypeList.indexOf(enchant);
		if(index != -1) enchantTypeList.remove(index);
		this.setEnchants(enchantTypeList);
		this.adjustAttackDamage();
	}

	public Integer getDamage() {
		return damage;
	}

	public void setDamage(Integer damage) {
		this.damage = damage;
	}

	public List<EnchantType> getEnchants() {
		return enchants;
	}

	public void setEnchants(List<EnchantType> enchants) {
		this.enchants = enchants;
	}

	public Integer getBASE_DAMAGE() {
		return BASE_DAMAGE;
	}
}
