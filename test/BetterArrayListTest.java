import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import exercises.BetterArrayList;

public class BetterArrayListTest {

	@Test
	void testPop() {

		BetterArrayList bal = new BetterArrayList();
		bal.add("str");
		bal.add(243);
		bal.add("asddf");
		bal.add(234);
		bal.add("dsf");
		bal.add("fdsg");

		assertEquals("fdsg", bal.pop());
		assertEquals("dsf", bal.pop());
		assertEquals(234, bal.pop());
		assertEquals("asddf", bal.pop());
		assertEquals(243, bal.pop());
		assertEquals("str", bal.pop());
		assertEquals(null, bal.pop());
	}

}
