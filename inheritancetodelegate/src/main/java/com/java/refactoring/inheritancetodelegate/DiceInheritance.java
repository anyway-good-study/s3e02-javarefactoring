package com.java.refactoring.inheritancetodelegate;

import java.util.Random;

public class DiceInheritance extends Random {
	private static final long serialVersionUID = -6375325750729757785L;

	public DiceInheritance() {
		super(314159L);
	}

	public DiceInheritance(long seed) {
		super(seed);
	}

	@Override
	public int nextInt() {
		return this.nextInt(6) + 1;
	}

	@Override
	public void nextBytes(byte[] bytes) {
		throw new UnsupportedOperationException("unsupport in dice");
	}

}
