package CharacterNames;

public class orc {
private int age;
	
	private String fullName = "";
	private String lastName = "";
	private boolean genderMale = true;

	public orc() {

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
