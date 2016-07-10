
public class Capitalize {

	public String cap(String s) {
		char[] ss = s.toCharArray(); // turn to char[]
		int temp = 'Z' - 'z';
		boolean mark = true;
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] == ' ') {
				mark = true;
			} else {
				// why not use else if (mark)?
				if (mark) {
					if (ss[i] >= 'a' && ss[i] <= 'z') {
						// you can use a int parameter to replace 'Z' - 'z'
						// outside
						// then here can be simplier.
						ss[i] += ('Z' - 'z');
					} else if (mark) {
						if (ss[i] >= 'a' && ss[i] <= 'z') {
							ss[i] += temp;
						}
						mark = false;
					}
				}
			}
		}
		return new String(ss);
	}

	public static void main(String[] args) {
		Capitalize c = new Capitalize();
		String n = "we love seattle and will live here for a long time.";
		String t = c.cap(n);
		System.out.print(t);
	}
}
