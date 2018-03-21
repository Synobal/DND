package Create;

import CharacterNames.dwarf;
import CharacterNames.elf;
import CharacterNames.human;
import CharacterNames.nameExtractor;

public class createNPC {
		
	
	
	public createNPC() {
		
	}
	
	
	public void setName() {
	String classType = getNPCClass();
	//
	
	
	switch(classType) {
	case "Human":
		createHuman humanReference = new createHuman();
		human cHuman = new human();
		cHuman = humanReference.setUpHuman(cHuman);
		System.out.println(cHuman.getFullName());
		//System.out.println("has completed human");
		//System.out.println(cHuman.getFullName());
		break;
	case "Orc":
		break;	
	case "Elf":
		createElf elfReference = new createElf();
		elf cElf = new elf();
		
		cElf = elfReference.setUpElf(cElf);
		System.out.println(cElf.getFullName());
	break;
	case "Dwarf":
		createDwarf dwarfReference = new createDwarf();
		dwarf cDwarf = new dwarf();
		
		cDwarf = dwarfReference.setUpDwarf(cDwarf);
		System.out.println(cDwarf.getFullName());
	break;
	}
	
		
	}
	
	
	public String getNPCClass() {
		validClasses valid = new validClasses();
		
		String npcName = valid.getNameClass();
		
		
		return npcName;
	}
}
