package edu.n3.exercise_3;

import java.io.*;

public class DiskWriter {

	private String fileName;

	public DiskWriter(String fileName) {
		this.fileName = fileName;
	}

	public void addLine(String line) {

		try (FileWriter fileWriter = new FileWriter(fileName, true)) {
			fileWriter.write(line + "\r");
		} catch (IOException e) {
			System.out.println("Error: " + e);
			;
		}
	}
}
