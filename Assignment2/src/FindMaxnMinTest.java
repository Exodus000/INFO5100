import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class FindMaxnMinTest {
	private FindMaxnMin b;
	
	@Before
	public void setup(){
		b= new FindMaxnMin();
	}
	@Test
	public void test1() {
		int[] s = {-2,-67,0,90,1,56};
		int[] ret = b.findmaxnmin(s); 
		assertEquals(90,ret[0]);
		assertEquals(-67,ret[1]);
	}
	@Test
	public void test2() {
		int[] s = {78,99,45,12,7,21};
		int[] ret = b.findmaxnmin(s); 
		assertEquals(99,ret[0]);
		assertEquals(7,ret[1]);
	}
	}
