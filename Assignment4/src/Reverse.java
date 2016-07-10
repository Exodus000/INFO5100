// - Write a Java program to reverse the words in a sentence
// (Don't use library functions like split() or StringTokenizer)
// - Please write a Junit test
// - For eg:-
// Input : I love the object oriented program course in NEU
// Output : NEU in course program oriented object the love I

public class Reverse {
  public void reverse(char[] sen, int start, int end) {
    for (int i = start, j = end - 1; i < j; i++, j--) {
      char temp = sen[i];
      sen[i] = sen[j];
      sen[j] = temp;
    }
  }

  public String print(String s) {
    if ((s == null) || (s.length() < 2)) {
      return s;
    }

    char[] words = s.toCharArray();

    // Reverse string comment please keep consistency, either all start with capital or all start
    // with lowercase
    reverse(words, 0, words.length);

    // test System.out.println(one); what does this line mean?
    // reverse each words
    int h = 0;
    for (int k = 0; k < words.length; k = h + 1) {
      // this for loop is not fancy, how about changing it to while?
      for (h = k; (h < words.length) && (words[h] != ' '); h++) {
      }
      reverse(words, k, h);
    }
    return new String(words);
  }

  public static void main(String[] args) {
    String s1 = "I love the object oriented program course in NEU";
    Reverse r = new Reverse();

    System.out.println(r.print(s1));
  }
}
