import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CapitalizeTest {
	private Capitalize c;

	@Before
	public void setup() {
		 c = new Capitalize();
	}

	@Test
	public void test() {
		String s = " our teeth and ambitions are bared";
		String t = " Our Teeth And Ambitions Are Bared";
		assertEquals(t,c.cap(s));
	}

}
