package Create;

import java.util.Random;

import randomiser.Randomiser;

public class validClasses {
	private static final String[] validClasses = {
	        "Human", "Elf", "Dwarf"
	    };
	
	//, "Orc", "Dwarf"
	
	public String getNameClass() {
		Randomiser pickRandom = new Randomiser();
		
		int classNumber = pickRandom.pickRandom(0, 3);
		
		String returnClass = validClasses[classNumber];
		System.out.println("class Number is: " + classNumber + " return class is: " + returnClass);
		return returnClass;
	}
}
