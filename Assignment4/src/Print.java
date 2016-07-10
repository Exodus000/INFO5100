import java.util.ArrayList;

public class Print {

	public ArrayList<String> p(String s) {
		ArrayList<String> a = new ArrayList<String>();
		// even in this question, prof. does not mention not use split(),
		// but it is better not to use split() and regular expression to split words,
		// try to practice more to use your own loops.
		String[] str = s.split("[\\s\\.]+");
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() > 3) {
				a.add(str[i]);
			}
		}
		return a;
	}

	public static void main(String[] args) {
		Print pt = new Print();
		String t = "Java is a cool OOP. It doesnt have multiple inheritance";
		ArrayList<String> out = pt.p(t);
		for (String n : out) {
			System.out.println(n);
		}
	}

}
