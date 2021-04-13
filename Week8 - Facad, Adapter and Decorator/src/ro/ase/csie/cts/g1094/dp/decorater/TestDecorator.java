package ro.ase.csie.cts.g1094.dp.decorater;

import ro.ase.csie.cts.g1094.dp.adapter.ACMESuperHero;
import ro.ase.csie.cts.g1094.dp.adapter.FantasyHero;

public class TestDecorator {

	public static void main(String[] args) {
		
		ACMESuperHero blueDragon= new FantasyHero("Blue Dragon", 1000, true);
		blueDragon.move();
		blueDragon.takeAHit(500);
		blueDragon.heal(250);
		
		
		
		//ACMESuperHero blueDragonWithShield
		blueDragon= new ShieldDecorator(blueDragon,300);
		blueDragon.takeAHit(500);
		
		blueDragon = new WondedDecorator(blueDragon);
		blueDragon.takeAHit(1000);
		blueDragon.takeAHit(1000);
		blueDragon.move();

	}

}
