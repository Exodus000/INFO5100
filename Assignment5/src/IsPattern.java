import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] strs = str.split(" ");
		if(strs == null || pattern ==null)
			return false;	//illegal input
		if (strs.length != pattern.length())
			return false;
		Map map = new HashMap();
		for (int i = 0; i < strs.length; ++i)
			if (!Objects.equals(map.put(pattern.charAt(i), i), map.put(strs[i], i)))  //check if match pattern
				return false;
		return true;
	}

	public static void main(String[] args) {
		IsPattern checkpattern = new IsPattern();
		String s = "abba";
		String t = "dog cat cat dog";
		if (checkpattern.wordPattern(s, t)) {
			System.out.println(t + " follows the pattern " + s + ".");
		} else {
			System.out.println(t + " do not follows the pattern " + s + ".");
		}

	}

}
