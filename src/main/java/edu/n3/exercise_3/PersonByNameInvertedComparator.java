package edu.n3.exercise_3;

import java.util.Comparator;

public class PersonByNameInvertedComparator implements Comparator<Person> {

	@Override
	public int compare(Person person1, Person person2) {
		int result = 1;

		if (person1.getDni().equals(person2.getDni())) {
			result = 0;
		} else {
			result = -person1.getName().compareTo(person2.getName());
		}

		return result;
	}
}