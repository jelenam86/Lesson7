package exercises;

import java.util.ArrayList;

public class Hospital {

	public static void main(String[] args) {
		
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		doctors.add(new Surgeon());
		doctors.add(new GeneralPractitioner());
		doctors.add(new Doctor("md"));
		
		for(Doctor dr : doctors) {
			System.out.println(dr.getTitle());
			dr.doMedicine();
			System.out.println();
		}

	}

}
