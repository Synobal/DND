import java.util.ArrayList;

import CharacterNames.human;
import CharacterNames.nameExtractor;
import Create.createHuman;
import Create.createNPC;
import Create.validClasses;
import randomiser.Randomiser;

public class Game {
	private ArrayList<String> playerNames;
	Randomiser randNumber;
	
	
	public Game() {
	 
		
		}
	public ArrayList<String> playernames() {
		return playerNames;
		
	}
	
	public int numberOfPlayers() {
			return 0;
	}
	
	
	public static void main(String args[]) {

		int counter = 0;
		while(counter < 10) {
		createNPC newelf = new createNPC();
		newelf.setName();
		counter++;
		}
		/*
	createHuman name = new createHuman();
	human cHuman = new human();
	name.setUpHuman(cHuman);
	System.out.println(cHuman.getFullName());
	
	human cHuman2 = new human();
	name.setUpHuman(cHuman2);
	
	*/
	
	}
}


