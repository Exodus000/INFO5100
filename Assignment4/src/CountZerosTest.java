import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;
<<<<<<< Updated upstream
// please not use wildcard import
import static org.junit.Assert.*;
=======
>>>>>>> Stashed changes

public class CountZerosTest {
	private CountZeros count;

	@Before
	public void setup() {
		count = new CountZeros();
	}

	// your UT does not cover pringt() function right? Actually UT need to cover every meaningful function.
	@Test
	public void test0() throws Exception {
		int[] nums = { 0, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0 };
		int digit = 0;
		assertArrayEquals(new int[] { 1, 0, 3, 0, 0, 0, 0, 0, 2, 0, 0, 5, 0, 0, 0, 0 }, count.move(nums, digit));
	}
	
	 @Test
	  public void test1() {
	    int[] nums = {0, 1, 0, 1, 1, 0, 0, 1};
	    int digit = 0;
	    assertArrayEquals(new int[]{1, 0, 1, 0, 0, 2, 0, 0}, count.move(nums, digit));
	  }

	 @Test
	  public void testprint() {
	    int[] nums = {0, 1, 0, 1, 1, 0, 0, 1};
	    int digit = 1;
	    int[] ret = count.move(nums, digit);
	    assertSame("11 occurs @ index 3", count.print(ret, digit));
	  }
}System.out.interface
