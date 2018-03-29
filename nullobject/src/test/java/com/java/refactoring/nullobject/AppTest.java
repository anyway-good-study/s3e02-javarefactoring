package com.java.refactoring.nullobject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Unit test for simple App.
 */

@RunWith(MockitoJUnitRunner.class)
public class AppTest {

	@Test
	public void testNullObject() {
		Person p = new Person(new Label("park"));
		p.display();
	}
}
