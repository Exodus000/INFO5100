import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PrimeTest {
	private Prime p;
	
	@Before
	public void setup(){
		p = new Prime();
		
	}

	@Test
	public void test2() {
		int n = 2 ;	
		assertTrue(p.isPrime(n));
	}
	
	@Test
	public void test27() {
		int n = 27 ;	
		assertFalse(p.isPrime(n));
	}
	
		
	}
