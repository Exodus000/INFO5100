import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FindSingleTest {
	private FindSingle find;

	@Before
	public void setup() {
		find = new FindSingle();
	}

	@Test
	public void testnull() {
		int[] nums = null;
		assertEquals(00, find.singleNumber(nums));
	}

	@Test
	public void testNumberinvaild() {
		int[] nums = { 1, 2 };
		assertEquals(00, find.singleNumber(nums));
	}

	@Test
	public void function() {
		int[] nums = { 1, 2, 1, 3, 4, 5, 4, 3, 5 };
		assertEquals(2, find.singleNumber(nums));
	}
}
