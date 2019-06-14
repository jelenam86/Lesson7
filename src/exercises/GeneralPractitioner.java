package exercises;

public class GeneralPractitioner extends Doctor {
	
	GeneralPractitioner() {
		super("general practitioner");
	}

	void makeHouseCalls() {
		System.out.println("Hallo? You there?");
	}
	
	void doMedicine() {
		System.out.println("I provide routine health care");
	}

}
