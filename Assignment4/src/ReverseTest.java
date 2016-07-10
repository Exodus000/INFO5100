
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReverseTest {

	private Reverse r;

	@Before
	public void setup() {
		r = new Reverse();

	}

	@Test
	public void testprint() {
		String a = "Ta To Ba";
		
		assertEquals("Ba To Ta",r.print(a));
	}
}
