import java.util.ArrayList;

import Healthpackage.Health;

public class player {
private Race race;

private String name;
private ArrayList<Skills> skills;
private Health health;

public player() {
	Health health = new Health();
}
public void setPlayerName(String name) {
	this.name = name;
}
public String getPlayerName() {
	return this.name;
}

}
