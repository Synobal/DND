package CharacterNames;

import java.io.BufferedReader;
import java.io.FileReader;

public class nameExtractor {

	private human[] collection;
	private String[] firstNameCollection;
	private String[] lastNameCollection;
	private int collectionMaxSize = 99999999;

	private int firstNameCollectionSize;
	private int lastNameCollectionSize;

	public nameExtractor() {
		firstNameCollectionSize = 0;
		lastNameCollectionSize = 0;
		firstNameCollection = new String[collectionMaxSize];
		lastNameCollection = new String[collectionMaxSize];
	}

	public void readFirstNameFromFile(String firstNames) {
		//System.out.println("is here");
		String personLine = "";
		try {
			FileReader fr = new FileReader(firstNames);

			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				personLine = br.readLine();

				// String[] arr= personLine.split(";");
				String firstName = personLine;
				// System.out.println("first name is: " + firstName);
				// System.out.println(firstName);
				// String lastName = arr[1].trim();
				// System.out.println(arr[3].trim());

				// System.out.println(personAge);
				// addHuman(firstName, lastName);
				addFirstName(firstName);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void readLastNameFromFile(String lastNames) {
		//System.out.println("is here");
		String personLine = "";
		try {
			FileReader fr = new FileReader(lastNames);

			BufferedReader br = new BufferedReader(fr);
			while (br.ready()) {
				personLine = br.readLine();

				// String[] arr= personLine.split(";");
				String lastName = personLine;
				// System.out.println("first name is: " + firstName);
				// System.out.println(firstName);
				// String lastName = arr[1].trim();
				// System.out.println(arr[3].trim());

				// System.out.println(personAge);
				// addHuman(firstName, lastName);
				addLastName(lastName);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void addHuman(String fname, String lname) {
		// collection[size++] = new human(fname,lname);
	}

	// adds first name to the array first name
	public void addFirstName(String fname) {
		// System.out.println("size is: " + size);
		firstNameCollection[firstNameCollectionSize++] = fname;
		// System.out.println("size is2: " + size);
		// System.out.println(fname);
	}

	// adds last name to the array last name
	public void addLastName(String Lname) {
		lastNameCollection[lastNameCollectionSize++] = Lname;
	}

	public int getLastNameCollectionSize() {
		return lastNameCollectionSize;
	}

	public int getFirstNameCollectionSize() {
		return firstNameCollectionSize;
	}

	public String getFirstNames() {
		String stringReturnValue = firstNameCollection[0];

		for (int iteration = 1; iteration < firstNameCollectionSize; iteration++)
			stringReturnValue = stringReturnValue + ", " + firstNameCollection[iteration];
		return stringReturnValue;
	}

	public String getLastNames() {
		String stringReturnValue = lastNameCollection[0];

		for (int iteration = 1; iteration < lastNameCollectionSize; iteration++)
			stringReturnValue = stringReturnValue + ", " + lastNameCollection[iteration];
		return stringReturnValue;
	}
	//returns certain firstName at the given position
	public String getCertainFirstName(int collectionPosition) {
		return firstNameCollection[collectionPosition];
	}
//returns certain lastName at the given position
	public String getCertainLastName(int collectionPosition) {
		return lastNameCollection[collectionPosition];
	}

}
