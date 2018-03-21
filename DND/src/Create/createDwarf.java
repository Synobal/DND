package Create;

import CharacterNames.dwarf;
import CharacterNames.dwarfNameExtractor;
import CharacterNames.elf;
import CharacterNames.elfNameExtractor;
import randomiser.Randomiser;

public class createDwarf {
	private Randomiser randNumber;
	private boolean genderMale = true;
	private int maxAge = 100;
	private int age;

	public createDwarf() {
		

		

		randNumber = new Randomiser();
		
		
	}

	public dwarf setUpDwarf(dwarf cDwarf) {
		setAge();
		cDwarf.setAge(age);
		String name = setDwarfName(cDwarf);
		cDwarf.setFullName(name);
		
		return cDwarf;
	}
	
	public void setAge() {
		age = randNumber.pickRandom(0, maxAge + 1);
	}
	public int getAge() {
		return age;
	}

	public void setDwarfGender(dwarfNameExtractor name) {
		genderMale = name.getGender();

	}

	public boolean getElfGender() {
		return genderMale;
	}

	public String setDwarfName(dwarf cDwarf) {
		dwarfNameExtractor name2 = new dwarfNameExtractor();

		int firstNameSize = name2.getFirstNameCollectionSize();
		int lastNameSize = name2.getLastNameCollectionSize();

		// int test = ;
		// System.out.println("First name size: " +firstNameSize);
		String firstNamePick = name2.getCertainFirstName(randNumber.pickRandom(0, (firstNameSize)));
		String lastNamePick = name2.getCertainLastName(randNumber.pickRandom(0, lastNameSize));
		// firstNamePick + " " +
		setDwarfGender(name2);
		
		cDwarf.setLastName(lastNamePick);
		
		return firstNamePick + " " + lastNamePick;

	}
}
