package CharacterNames;

import java.io.BufferedReader;
import java.io.FileReader;

public class human {

	private int age;
	
	private String fullName = "";
	private String lastName = "";
	private boolean genderMale = true;
	private boolean isMarried =false;
	
	
	public human() {

	}

	public int getAge() {
		return this.age;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(boolean gender) {
		genderMale = gender;
	}
	
	public void setFullName(String fName) {
		fullName = fName;
	}
	public void setLastName(String lName) {
		lastName = lName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getFullName()
	{
		return fullName;
	}
	

}