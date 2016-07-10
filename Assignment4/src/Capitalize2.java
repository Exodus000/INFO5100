

public class Capitalize2 {
    public static void main(String[] args) {
        String instr = "we love seattle and will live here for a long time.";
        String outstr = "";
        outstr = outstr + instr.substring(0, 1).toUpperCase();
        boolean flag = true;
        for(int i = 1; i < instr.length(); i++){
            if(flag == true){
                outstr = outstr + instr.substring(i, i+1).toUpperCase();
                flag = false;
            }
            else
                outstr = outstr + instr.substring(i, i+1);
            if(instr.charAt(i)==' ')
                flag = true;
        }
        System.out.print(outstr);
    }
}