package edu.n3.exercise_3;

import java.util.*;

public class UsersHandler {

	private DiskWriter writer;
	private DiskReader reader;
	private Set<Person> personSet;
	private ArrayList<String[]> dataArray;
	private ArrayList<String> headerList;

	public UsersHandler(String fileName) {
		writer = new DiskWriter(fileName);
		reader = new DiskReader(fileName);
		headerList = new ArrayList<String>();
	}

	public void addPerson() {
		uploadCsv();
		fillPersonSet(new PersonByNameComparator());
		int initialPersonSetSize = personSet.size();

		Person person = new Person();
		writer.addLine(person.getCsvLine());

		if (initialPersonSetSize == personSet.size()) {

		}
		Input.readString("Persona afegida! Prem intro.");
	}

	private void uploadCsv() {
		dataArray = reader.getCsvData();

		if (dataArray.isEmpty()) {
			writer.addLine("___Nom___;____Cognoms___;__NIF___;");
			writer.addLine("---------;--Test User---;--------;");
			dataArray = reader.getCsvData();
		}
	}

	private void fillPersonSet(Comparator<Person> comparator) {
		personSet = new TreeSet<Person>(comparator);
		int i = 0;
		for (String[] array : dataArray) {

			if (i == 0) {

				for (int f = 0; f < 3; f++) {
					headerList.add(array[f]);
				}

				i++;
			} else {
				personSet.add(new Person(array[0], array[1], array[2]));
			}
		}
	}

	private void showPersons() {

		if (!headerList.isEmpty()) {
			System.out.println(String.format("%-13s", headerList.get(0)) + String.format("%-20s", headerList.get(1))
					+ String.format("%-16s", headerList.get(2)));

			for (Person person : personSet) {
				System.out.println(person);
			}

			Input.readString("\nPrem Intro.");
		}
	}

	public void sortByName() {
		uploadCsv();
		fillPersonSet(new PersonByNameComparator());
		showPersons();
	}

	public void sortByNameInverted() {
		uploadCsv();
		fillPersonSet(new PersonByNameInvertedComparator());
		showPersons();
	}

	public void sortByLastName() {
		uploadCsv();
		fillPersonSet(new PersonByLastNameComparator());
		showPersons();
	}

	public void sortByLastNameInverted() {
		uploadCsv();
		fillPersonSet(new PersonByLastNameInverdedComparator());
		showPersons();
	}

	public void sortByDni() {
		uploadCsv();
		fillPersonSet(new PersonByDniComparator());
		showPersons();
	}

	public void sortByDniInverted() {
		uploadCsv();
		fillPersonSet(new PersonByDniInvertedComparator());
		showPersons();
	}
}
