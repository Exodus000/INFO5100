import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseImportLine {
  public static ArrayList<String> readFile(File file) throws IOException {
    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(fis);
    BufferedReader br = new BufferedReader(isr); // Set reader
    ArrayList<String> ret = new ArrayList<String>();

    while (br.readLine() != null) {
      String line = br.readLine();
      ret.add(line); // read file line by line and put them into a arraylist
    }
    br.close();

    return ret;
  }

  public static ArrayList<String> reverseFile(ArrayList<String> ret) {
    Collections.reverse(ret); // reverse the return arraylist
    return ret;

  }

  public static void main(String[] args) throws IOException {
    File file = new File("/Users/kk/desktop/stray birds.txt");
    ArrayList<String> res = reverseFile(readFile(file));
    for (int i = 0; i <= res.size() - 1; i++) {
      System.out.println(res.get(i)); // out put the reversed file
    }
  }
}
