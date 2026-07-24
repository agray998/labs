package lab7;
import java.util.*;

public class Zoo {
	HashMap<String, Integer> animalMap;
	String[] oldAnimals = {"zebra", "lion", "buffalo", "lion"};
	String[] newAnimals = {"buffalo", "gazelle", "buffalo", "zebra", "rhino"};
	
	Zoo() {
		this.animalMap = new HashMap<String, Integer>();
		this.addAnimals(oldAnimals);
		this.addAnimals(newAnimals);
		this.displayAnimalData();
	}
	
	void addAnimals(String[] animals) {
		for (String a : animals) {
			if (this.animalMap.containsKey(a)) {
				this.animalMap.put(a, this.animalMap.get(a) + 1);
			} else {
				this.animalMap.put(a, 1);
			}
		}
	}
	
	void displayAnimalData() {
		for (String a : this.animalMap.keySet()) {
			System.out.printf("%s\t%d\n", a, this.animalMap.get(a));
		}
	}

}
