package com.java.refactoring.nullobject;

public class NullLabel extends Label {

	public NullLabel() {
		super("none");
	}

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public void display() {

	}
}
