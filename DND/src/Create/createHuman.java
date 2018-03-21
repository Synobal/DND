package Create;

import CharacterNames.human;
import CharacterNames.humanNameExtractor;
import randomiser.Randomiser;

public class createHuman extends createNPC {
	private Randomiser randNumber;
	private boolean genderMale = true;
	private int maxAge = 100;
	private int age;
	private boolean isMarried = false;

	public createHuman() {
		

		

		randNumber = new Randomiser();
		
		
	}

	public human setUpHuman(human cHuman) {
		setAge();
		cHuman.setAge(age);
		String name = setHumanName(cHuman);
		cHuman.setFullName(name);
		
		return cHuman;
	}
	
	public void setAge() {
		age = randNumber.pickRandom(0, maxAge + 1);
	}
	public int getAge() {
		return age;
	}
	
	public boolean getMarrageStatus() {
		int percentageChance = randNumber.pickRandom(0, 101);
		if(age < 16) {
			if(percentageChance < 20) {
				
			}
		}
		
		return false;
	}

	public void setHumanGender(humanNameExtractor name) {
		genderMale = name.getGender();

	}

	public boolean getHumanGender() {
		return genderMale;
	}

	public String setHumanName(human cHuman) {
		humanNameExtractor name2 = new humanNameExtractor();

		int firstNameSize = name2.getFirstNameCollectionSize();
		int lastNameSize = name2.getLastNameCollectionSize();

		// int test = ;
		// System.out.println("First name size: " +firstNameSize);
		String firstNamePick = name2.getCertainFirstName(randNumber.pickRandom(0, (firstNameSize)));
		String lastNamePick = name2.getCertainLastName(randNumber.pickRandom(0, lastNameSize));
		// firstNamePick + " " +
		setHumanGender(name2);
		
		cHuman.setLastName(lastNamePick);
		
		return firstNamePick + " " + lastNamePick;

	}

}
