
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IsValidTest {
	private IsValid checkpair;

	@Before
	public void setup() {
		checkpair = new IsValid();
	}

	@Test
	public void testATeamOfPairs() {
		assertEquals(true, checkpair.isValid("{}([])"));
		assertEquals(false, checkpair.isValid("([}])"));
		assertEquals(true, checkpair.isValid("([])"));
		assertEquals(true, checkpair.isValid("()[]{}[][]"));
	}

}
