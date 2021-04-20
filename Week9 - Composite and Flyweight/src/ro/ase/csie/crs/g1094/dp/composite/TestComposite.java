package ro.ase.csie.crs.g1094.dp.composite;

public class TestComposite {
	
	public static void main(String[] args) {
		
		AbstractNode group1= new Group("Ref team");
		group1.addNewNode(new NPC("soldier 1", 100));
		group1.addNewNode(new NPC("soldier 2", 100));
		
		
		AbstractNode group2= new Group("Blue team");
		group2.addNewNode(new NPC("Soldier 3", 100));
		group2.addNewNode(new NPC("Tank", 500));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNewNode(new NPC("Level Boss", 1000));
		levelGroup.addNewNode(group1);
		levelGroup.addNewNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		
		levelGroup.getNode(0).move();

	}
	
	
	

}
