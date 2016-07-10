import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FindMaxTest {
	private FindMax f;

	@Before
	public void setup() {
		f = new FindMax();
	}

	@Test
	public void test1() {
		int[] a = { 2, 45, 76, 133, 54, 1, -432 };
		assertEquals(133, f.findmax(a));

	}

	@Test
	public void test2() {
		int[] a = { -78, -45, -1, 0, 34, 46, 547, 22 };
		assertEquals(547, f.findmax(a));

	}

}
