
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Person p1;
	private Person p2;

	@Before
	public void setup() {
		p1 = new Person();
		p2 = new Person();
	}

	@Test
	public void testGetAndSetName() {
		p1.setName("jonathan", "joestar");
		assertEquals("jonathan", p1.getFirstName());
		assertEquals("joestar", p1.getLastName());
	}

	@Test
	public void testCompare() {
		p1.setName("jonathan", "joestar");
		p2.setName("josef", "joestar");
		assertEquals(-5, p1.compareTo(p2));
	}

	@Test
	public void testequals() {
		p1.setName("jonathan", "joestar");
		p2.setName("josef", "joestar");
		assertFalse(p1.equals(p2));
	}

	@Test
	public void testToString() {
		p1.setName("jonathan", "joestar");
		assertEquals("FirstName: jonathan LastName: joestar", p1.toString());
	}

}
