import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class IsPatternTest {
	private IsPattern ispattern;

	@Before
	public void setup() {
		ispattern = new IsPattern();
	}

	@Test
	public void testNullInput() {
		String s = null;
		String t = "test";
		assertFalse(ispattern.wordPattern(s, t));
	}

	@Test
	public void testWrongLength() {
		String s = "txt";
		String t = "test test";
		assertFalse(ispattern.wordPattern(s, t));
	}

	@Test
	public void testMatchPattern() {
		String s = "abba";
		String t = "test txt txt test";
		assertTrue(ispattern.wordPattern(s, t));
	}
	
	@Test
	public void testDontMatchPattern() {
		String s = "abba";
		String t = "test test txt test";
		assertFalse(ispattern.wordPattern(s, t));
	}
}
