
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CountDigitsTest {

	private CountDigits count;

	@Before
	public void setup() {
		count = new CountDigits();
	}

	@Test
	public void test0() {
		int n = 0;
		assertEquals(1, count.countdigits(n));
	}

	@Test
	public void test11111(){
		int n = 11111 ;
		assertEquals(5, count.countdigits(n));
	}
}
