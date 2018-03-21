package Create;

import CharacterNames.elf;
import CharacterNames.elfNameExtractor;
import randomiser.Randomiser;

public class createElf extends createNPC {
	private Randomiser randNumber;
	private boolean genderMale = true;
	private int maxAge = 100;
	private int age;

	public createElf() {
		

		

		randNumber = new Randomiser();
		
		
	}

	public elf setUpElf(elf cElf) {
		setAge();
		cElf.setAge(age);
		String name = setElfName(cElf);
		cElf.setFullName(name);
		
		return cElf;
	}
	
	public void setAge() {
		age = randNumber.pickRandom(0, maxAge + 1);
	}
	public int getAge() {
		return age;
	}

	public void setElfGender(elfNameExtractor name) {
		genderMale = name.getGender();

	}

	public boolean getElfGender() {
		return genderMale;
	}

	public String setElfName(elf cElf) {
		elfNameExtractor name2 = new elfNameExtractor();

		int firstNameSize = name2.getFirstNameCollectionSize();
		int lastNameSize = name2.getLastNameCollectionSize();

		// int test = ;
		// System.out.println("First name size: " +firstNameSize);
		String firstNamePick = name2.getCertainFirstName(randNumber.pickRandom(0, (firstNameSize)));
		String lastNamePick = name2.getCertainLastName(randNumber.pickRandom(0, lastNameSize));
		// firstNamePick + " " +
		setElfGender(name2);
		
		cElf.setLastName(lastNamePick);
		
		return firstNamePick + " " + lastNamePick;

	}

}
