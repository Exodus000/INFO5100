
/*Given a string containing the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid. If the string contains any other characters,
please throw suitable exception.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.*/

import java.util.HashMap;
import java.util.Stack;

public class IsValid {
	public boolean isValid(String s) {
		if (s.length() == 0) {
			return false;		//check length
		}
		if ((s.length() % 2) != 0) {
			return false;
		}
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');// set the control group
		map.put('{', '}');

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char curr = s.charAt(i);
			if (map.keySet().contains(curr)) {	//check first char of the pair
				stack.push(curr);
			} else if (map.values().contains(curr)) { // check last char of the pair
				if (!stack.empty() && map.get(stack.peek()) == curr) {
					stack.pop();
				} else {
					return false;
				}
			}
		}

		return stack.empty();
	}
	// finish your code here

	public static void main(String[] args) {
		IsValid CheckPair = new IsValid();
		String s = "()[]{}{}";
		if (CheckPair.isValid(s)) {
			System.out.println("The Pattern is valid.");
		} else {
			System.out.println(" The Pattern is invalid.");
		}
	}

}
