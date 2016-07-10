import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindaCharTest {
	private FindaChar f;

	@Before
	public void setup() {
		f = new FindaChar();
	}

	@Test

	public void thisisatest() {
		String str = "thisisatest";

		assertEquals(1, f.findA(str));
	}

	@Test
	public void kamenrideratsume() {
		String str = "kamenrideratsume";
		assertEquals(2, f.findA(str));
	}
}
