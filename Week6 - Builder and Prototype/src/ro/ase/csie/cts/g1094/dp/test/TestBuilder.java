package ro.ase.csie.cts.g1094.dp.test;

import ro.ase.csie.cts.g1094.dp.builder.Pistol;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero;
import ro.ase.csie.cts.g1094.dp.builder.SuperHeroesDirector;
import ro.ase.csie.cts.g1094.dp.builder.SuperHero.SuperHeroBuilder;

public class TestBuilder {

	public static void main(String[] args) {
		
		
		//1.create the object
		//SuperHero superHero=new SuperHero();
		//2.init the object
		//TO DO: dont forget
		//superHero.name="Superman";
		//superHero.lifePoints=100;
		//superHero.superPower="Can fly";
		//superHero.superPower="Laser eyes";
		
		
		//SuperHero superHero=new SuperHero("Superman", 100, false, false, null, new Pistol(), "Laser eyes", null);
		
		
		SuperHero superman=new SuperHero.SuperHeroBuilder("Superman", 100)
				.addSuperPower("Fly")
				.addLeftWeapon(new Pistol())
				.build();
		
		
		SuperHero joker= new SuperHero.SuperHeroBuilder("Joker", 200)
				.isVillain()
				.addLeftWeapon(new Pistol())
				.addRightWeapon(new Pistol())
				.build();
		
		SuperHeroesDirector catalogue= new SuperHeroesDirector(new SuperHeroBuilder("Joker", 200));
		SuperHero jokerClone=catalogue.buildJoker();

	}

}
