package example.defaultMethods;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AbstractTestCases
{

	@Test
	void abstractTestCase()
	{
		ChildCircle c = new ChildCircle();
		c.setColor("blue");

		assertTrue(c.isValidCircle());
	}

	@Test
	void defaultMethodInterfaceTestCase()
	{
		CircleInterfaceImpl c = new CircleInterfaceImpl();
//		c.setColor("blue");

		assertTrue(c.isValidCircle()); // fails

		// this means that when you use default methods in the interface, you need to
		// set the state of the object explicitly. Interface cannot force the implementing classes to first set their state.
	}
}
