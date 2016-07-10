
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MyHashMapTest {
	private MyHashMap map;

	@Before
	public void setup() {
		map = new MyHashMap();
	}

	@Test
	public void Put() {
		MyHashMap<String, Jojo> map = new MyHashMap<String, Jojo>();
		map.put("Jonathan", new Jojo("Jonathan", 1868));
		map.put("Josef", new Jojo("Josef", 1920));
		assertEquals(1868, map.get("Jonathan").getBornYear());
		assertEquals(1920, map.get("Josef").getBornYear());
	}

	@Test
	public void getSomethingThatIsUnexist() {
		MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
		assertEquals(null, map.get(3));
	}

	@Test
	public void overWrite() {
		MyHashMap<Integer, String> map = new MyHashMap<Integer, String>();
		map.put(3, "dio");
		assertEquals("dio", map.get(3));
		map.put(3, "jotaro");
		assertEquals("jotaro", map.get(3));
	}

	class Jojo {
		private String name;
		private int bornyear;

		public Jojo(String name, int bornyear) {
			this.name = name;
			this.bornyear = bornyear;
		}

		public String getName() {
			return name;
		}

		public int getBornYear() {
			return bornyear;
		}

	}
}
