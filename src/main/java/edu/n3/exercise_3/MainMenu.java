package edu.n3.exercise_3;

public enum MainMenu {
	INSERT_PERSON(1, "Introduir persona."), SORT_BY_NAME(2, "Mostrar les persones ordenades per nom (A-Z)."),
	SORT_BY_NAME_INVERTED(3, "Mostrar les persones ordenades per nom (Z-A)."),
	SORT_BY_LAST_NAME(4, "Mostrar les persones ordenades per cognoms (A-Z)."),
	SORT_BY_LAST_NAME_INVERTED(5, "Mostrar les persones ordenades per cognoms (Z-A)."),
	SORT_BY_DNI(6, "Mostrar les persones ordenades per DNI (1-9)."),
	SORT_BY_DNI_INVERTED(7, "Mostrar les persones ordenades per DNI (9-1)."), EXIT(0, "Sortir.");

	private final int index;
	private final String text;

	private MainMenu(int index, String text) {
		this.index = index;
		this.text = text;
	}

	public static int showMenu() {
		System.out.println("Tria una opció:");

		return Input.readInt(INSERT_PERSON.index + "- " + INSERT_PERSON.text + "\n" + SORT_BY_NAME.index + "- "
				+ SORT_BY_NAME.text + "\n" + SORT_BY_NAME_INVERTED.index + "- " + SORT_BY_NAME_INVERTED.text + "\n"
				+ SORT_BY_LAST_NAME.index + "- " + SORT_BY_LAST_NAME.text + "\n" + SORT_BY_LAST_NAME_INVERTED.index
				+ "- " + SORT_BY_LAST_NAME_INVERTED.text + "\n" + SORT_BY_DNI.index + "- " + SORT_BY_DNI.text + "\n"
				+ SORT_BY_DNI_INVERTED.index + "- " + SORT_BY_DNI_INVERTED.text + "\n" + EXIT.index + "- " + EXIT.text
				+ "\n", new Range(0, 7));
	}

	public int getIndex() {
		return index;
	}

	public String getText() {
		return text;
	}
}
