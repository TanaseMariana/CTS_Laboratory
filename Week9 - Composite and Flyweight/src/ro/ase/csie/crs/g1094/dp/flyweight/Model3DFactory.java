package ro.ase.csie.crs.g1094.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {
	
	static Map<String, ModelsFlyweightActions> models= new HashMap<>();
	
	static {
		models.put(ModelTypes.SOLDIER.toString(),new Model3DFlyweight("Soldier"));
		models.put(ModelTypes.TREE.toString(), new Model3DFlyweight("Tree"));
		
	}
	
	static ModelsFlyweightActions getModel(ModelTypes type) {
		return models.get(type.toString());
	}

}
