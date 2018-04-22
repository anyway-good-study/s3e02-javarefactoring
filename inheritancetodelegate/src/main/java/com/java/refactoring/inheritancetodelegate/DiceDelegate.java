package com.java.refactoring.inheritancetodelegate;

import java.util.Random;

public class DiceDelegate {

	private final Random random;

	public DiceDelegate() {
		this(314159L);
	}

	public DiceDelegate(long seed) {
		random = new Random(seed);
	}

	public int nextInt() {
		return this.random.nextInt(6) + 1;
	}

	public void setSeed(long seed) {
		this.random.setSeed(seed);
	}
}
