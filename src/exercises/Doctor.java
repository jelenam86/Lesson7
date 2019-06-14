package exercises;

public class Doctor {

	String title;

	Doctor(String t) {
		this.title = t;
	}

	public String getTitle() {
		return "I am " + title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	void doMedicine() {
		System.out.println("I am someone who maintains or restores human health through the practice of medicine.");
	}
}
