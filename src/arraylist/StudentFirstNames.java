package arraylist;

import java.util.ArrayList;

public class StudentFirstNames {

	private ArrayList<String> a2Students = new ArrayList<String>();

	public StudentFirstNames() {

		a2Students.add("Zachary");
		a2Students.add("Kyle");
		a2Students.add("Michael");
		a2Students.add("Mitchell");

	}

	public void showContents() {
		System.out.println("Contains: " + a2Students);

	}

	public void showSize() {
		System.out.println("Number of student names is " + a2Students.size());

	}

	public ArrayList<String> getA2Students() {
		return a2Students;
	}

	public void setA2Students(ArrayList<String> a2Students) {
		this.a2Students = a2Students;
	}

}
