package exercises;

public class Surgeon extends Doctor {

	Surgeon() {
		super("surgeon");
	}

	void PerformSurgery() {
		System.out.println("Wish me good luck!");
	}

	void doMedicine() {
		System.out.println("I am the physician who cuts the human body for the purpose of "
				+ "removing diseased tissue or organs, to repair body systems, "
				+ "or to replace diseased organs with transplants.");
	}
}
