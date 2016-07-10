import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;

public class MyStackTest {

	private MyStack stack;

	@Before
	public void setup() {
		stack = new MyStack();
	}

	@Test
	public void testTop() {
		stack.push(1998);
		assertEquals(1998, stack.top());
	}

	@Test
	public void testPush() {
		stack.push(1);
		assertEquals(1, stack.top());
	}

	@Test
	public void testPop() {
		stack.push(1999);
		stack.push(1998);
		stack.pop();
		assertEquals(1999, stack.top());
	}

	@Test
	public void testEmpty() {
		assertTrue(stack.empty());
		stack.push(0);
		assertFalse(stack.empty());
	}

}
