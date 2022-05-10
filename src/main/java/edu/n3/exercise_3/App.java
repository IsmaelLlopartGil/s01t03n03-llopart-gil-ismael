package edu.n3.exercise_3;

import java.io.File;

public class App {

	public static void main(String[] args) {
		int option;
		UsersHandler usersHandler = new UsersHandler(
				"src" + File.separator + "main" + File.separator + "resources" + File.separator + "persones.csv");

		do {
			option = MainMenu.showMenu();

			if (option == MainMenu.INSERT_PERSON.getIndex()) {
				usersHandler.addPerson();
			} else if (option == MainMenu.SORT_BY_NAME.getIndex()) {
				usersHandler.sortByName();
			} else if (option == MainMenu.SORT_BY_NAME_INVERTED.getIndex()) {
				usersHandler.sortByNameInverted();
			} else if (option == MainMenu.SORT_BY_LAST_NAME.getIndex()) {
				usersHandler.sortByLastName();
			} else if (option == MainMenu.SORT_BY_LAST_NAME_INVERTED.getIndex()) {
				usersHandler.sortByLastNameInverted();
			} else if (option == MainMenu.SORT_BY_DNI.getIndex()) {
				usersHandler.sortByDni();
			} else if (option == MainMenu.SORT_BY_DNI_INVERTED.getIndex()) {
				usersHandler.sortByDniInverted();
			} else if (option == MainMenu.EXIT.getIndex()) {

			} else {
				System.out.println("Error.");
			}

		} while (option != MainMenu.EXIT.getIndex());
	}
}
