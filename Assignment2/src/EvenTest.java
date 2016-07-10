import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class EvenTest {
	private Even e;
	
	@Before
	public void setup(){
	e= new Even();
	}
	@Test
	public void test20() {
		int a = 20;
//		assertEquals([2, 4, 6, 8, 10, 12, 14, 16, 18, 20]);
		ArrayList<Integer> ret = e.findeven(a);
		
		for (int it = 0; it < ret.size(); it++) {
			assertEquals((it + 1) * 2, (int)ret.get(it));
		}
	}

}
