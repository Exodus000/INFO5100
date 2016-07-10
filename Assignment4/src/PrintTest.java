import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
 
public class PrintTest {
	private Print p;
	@Before 
	public void setup(){
		// be careful of indentation
	p =  new Print();
	}
	@Test
	public void test() {
		String s = "THE TREMBLING FEAR IS MORE THAN I CAN TAKE ";
		ArrayList<String> a = p.p(s);
		assertEquals(5,a.size());
		// you can use assertArrayEquals to simplify this.
		assertEquals("TREMBLING",a.get(0));
		assertEquals("FEAR",a.get(1));
		assertEquals("MORE",a.get(2));
		assertEquals("THAN",a.get(3));
		assertEquals("TAKE",a.get(4));
	}

}
