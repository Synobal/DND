package Create;

import java.util.ArrayList;

import CharacterNames.human;

public class holderNPC {

	private ArrayList<human> humanNPCNames;
	
	public holderNPC() {
		humanNPCNames = new ArrayList<human>();
		
	}
	
	
	public void addFile(human cHuman) {
		humanNPCNames.add(cHuman);
	}
	
}
