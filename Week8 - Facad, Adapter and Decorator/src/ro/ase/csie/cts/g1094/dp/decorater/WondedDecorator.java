package ro.ase.csie.cts.g1094.dp.decorater;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;

public class WondedDecorator extends AbstractDecorator{

	public WondedDecorator(ACMESuperHero hero) {
		super(hero);
		
	}

	@Override
	public void move() {
		if(this.hero.lifePoints > 500)
			this.hero.move();
		else {
			System.out.println("the hero is barely moving");
		}
	}
	
	

}
