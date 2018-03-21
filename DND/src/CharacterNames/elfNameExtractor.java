package CharacterNames;

import randomiser.Randomiser;

public class elfNameExtractor{
	private static String firstMaleNames = "src/characterNamesTextFiles/elf/maleElfFirstNames.txt";
	private static String firstFemaleNames = "src/characterNamesTextFiles/elf/femaleElfFirstNames.txt";
	private static String lastNames = "src/characterNamesTextFiles/elf/elfLastNames.txt";
	
	
	
	private nameExtractor name;
	private boolean genderMale = true;
	
	public elfNameExtractor() {
		Randomiser randNumber = new Randomiser();
		
		 name = new nameExtractor();
		 
		 String firstName;
		if(randNumber.pickRandom(0, 101)>50) {
			firstName = firstFemaleNames;
			genderMale = false;
		}else {
			firstName = firstMaleNames;
		}
		 
			
		 name.readFirstNameFromFile(firstName);
		 name.readLastNameFromFile(lastNames);
		 
		 
	}
	
	public int getLastNameCollectionSize() {
		return name.getLastNameCollectionSize();
		
	}
	
	public int getFirstNameCollectionSize() {
		return name.getFirstNameCollectionSize();
		
	}
	
	public String getCertainLastName(int collectionPosition) {
		return name.getCertainLastName(collectionPosition);
	} 
	public String getCertainFirstName(int collectionPosition) {
		return name.getCertainFirstName(collectionPosition);
	}
	public boolean getGender() {
		return genderMale;
	}
	
}

