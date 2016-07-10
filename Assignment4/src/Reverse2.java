
public class Reverse2 {

	public static void main(String[] args) {
		        String instr = "I love the object oriented program course in NEU";
		        String outstr = "";
		        int n = instr.length();
		        int p1 = n - 1;
		        int p2 = n;
		        for(; p1 >= 0; p1--)
		        {
		            if(instr.charAt(p1) == ' ')
		            {
		                outstr = outstr + instr.substring(p1 + 1, p2) + " ";
		                p2 = p1;
		            }
		        }
		        outstr = outstr + instr.substring(p1 + 1, p2);
		        System.out.println(outstr);
		    }

	}

