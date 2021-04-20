package ro.ase.csie.crs.g1094.dp.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Model3DFlyweight implements ModelsFlyweightActions{
	
	
	String name;
	List<Double> modelPoints= new ArrayList<>();

	
	
	public Model3DFlyweight(String name) {
		super();
		this.name = name;
	}

	@Override
	public void loadModel() {
		
		
	}

	@Override
	public void display(ScreenData data) {
		System.out.println(String.format("Printing %s at coordinates (%f,%f,%f)", name,data.x,data.y,data.z));
		
	}

}
