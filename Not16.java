import java.util.Arrays;

public class Not16 {
	int[] out; 
	
	public int[] not16(int[] in){
        Not NOT = new Not();
        int[] out = new int[16];
        for (int i=0; i<=15; i++) {
        	out[i]=NOT.not(in[i]);
        }
        return out;
    }
	/**public static void main(String[] args) {
		Not16 obj = new Not16();
		int in[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
 	    int[] out = new int[16];
		out = obj.not16(in);
		System.out.print(Arrays.toString(out));
	}**/

}