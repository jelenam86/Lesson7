package optional;

import java.util.ArrayList;
import java.util.Random;

public class LongChipCompetition {

	/**
	 * The Beatles are eating lunch and playing a game to see who has the longest
	 * chip. (In England, french fries are called "chips".)
	 * 
	 * Find the Beatle with the longest chip. You may not edit the Chip or Beatle
	 * classes. Make sure to initialize The Beatles before you start your search.
	 * 
	 **/

	private ArrayList<Beatle> theBeatles = new ArrayList<Beatle>();

	private void initializeBeatles() {
		Beatle george = new Beatle("George");
		Beatle john = new Beatle("John");
		Beatle paul = new Beatle("Paul");
		Beatle ringo = new Beatle("Ringo");

		theBeatles.add(george);
		theBeatles.add(john);
		theBeatles.add(paul);
		theBeatles.add(ringo);
	}

	private double maxChipsOnPlate(Beatle b) {
		double max = 0;
		ArrayList<Chip> chips = b.getChips();
		for (Chip c : chips) {
			double bSize = c.getLength();
			if (bSize > max) {
				max = bSize;
			}
		}
		return max;
	}

	public static void main(String[] args) {

		LongChipCompetition lcc = new LongChipCompetition();
		lcc.initializeBeatles();

		if (lcc.theBeatles.size() > 0) {
			double max = lcc.maxChipsOnPlate(lcc.theBeatles.get(0));
			String name = "";
			for (Beatle b : lcc.theBeatles) {
				int index = lcc.theBeatles.indexOf(b);
				double bSize = lcc.maxChipsOnPlate(lcc.theBeatles.get(index));
				if (bSize > max) {
					max = bSize;
					name = b.getName();
				}
			}
			System.out.println(name);
		} else
			System.out.println("There is no one at the table...");

	}
}

class Beatle {
	private String name;
	private ArrayList<Chip> chips = new ArrayList<Chip>();

	public Beatle(String name) {
		this.name = name;
		initializePlateOfChips();
	}

	private void initializePlateOfChips() {
		int numberOfChips = new Random().nextInt(100);
		for (int i = 0; i < numberOfChips; i++) {
			chips.add(new Chip(new Random().nextDouble() * 10));
			if (this.name.contains("in"))
				chips.add(new Chip(10));
		}
	}

	public ArrayList<Chip> getChips() {
		return this.chips;
	}

	public String getName() {
		return this.name;
	}

}

class Chip {
	private double length;

	public double getLength() {
		return length;
	}

	Chip(double d) {
		this.length = d;
	}
}
