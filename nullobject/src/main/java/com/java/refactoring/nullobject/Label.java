package com.java.refactoring.nullobject;

public class Label {
	private String label;

	public final static Label NULL = new NullLabel();

	public Label(String label) {
		this.label = label;
	}

	public void display() {
		System.out.println(label);
	}

	public boolean isNull() {
		return false;
	}

	// Factory Method
	// 매번 new NullLable()을 할 필요가 없음.
	public static Label newNull() {
		// New return
		// return new NullLabel();

		// Factory
		// return NullLabel2.getInstance();

		// 상수 반환
		return Label.NULL;
	}

	// private 클래스로 외부에 NullLabel이라는 클래스명을 노출하지 않아도 되는 NullLabel2
	private static class NullLabel2 extends Label {
		// 싱글턴
		private static final NullLabel2 singleton = new NullLabel2();

		private static NullLabel2 getInstance() {
			return singleton;
		}

		private NullLabel2() {
			super("(none)");
		}

		@Override
		public void display() {

		}

		@Override
		public boolean isNull() {
			return true;
		}
	}
}
