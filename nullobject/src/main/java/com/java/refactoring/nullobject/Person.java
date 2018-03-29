package com.java.refactoring.nullobject;

import com.google.common.base.Optional;

public class Person {
	Label name;
	Label mail;

	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}

	public Person(Label name) {
		this(name, new NullLabel());
	}

	public void display() {

		// 전통적인 if
		if (name != null) name.display();
		if (mail != null) mail.display();

		// Null 객체를 이용 - display를 호출하나 호출하지 않은 것처럼 만드는 방법
		name.display();
		mail.display();

		// java util Optional을 이용하여 아예 실행하지 않는 방법
		java.util.Optional.ofNullable(name).ifPresent(v -> v.display());
		java.util.Optional.ofNullable(mail).ifPresent(v -> v.display());

		// Guava Optional 이용
		Optional.fromNullable(name).orNull().display();
		Optional.fromNullable(mail).orNull().display();
	}
}
