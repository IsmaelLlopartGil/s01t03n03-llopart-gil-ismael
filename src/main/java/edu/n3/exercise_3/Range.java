package edu.n3.exercise_3;

public class Range {

	private int min;
	private int max;

	public Range(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public boolean contains(int value) {

		return value >= min && value <= max;
	}
}
