import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class FindLetterTest {
	private FindLetter f;
	
	@Before
	public void setup() {
		f = new FindLetter();
	}
	
	@Test
	public void testNo() {
		String str = "llllll";
		char c = 'a';
		assertEquals(0, f.getletter(str, c));
	}
	
	@Test
	public void test1() {
		String str = "alllll";
		char c = 'l';
		assertEquals(5, f.getletter(str, c));
	}
}
