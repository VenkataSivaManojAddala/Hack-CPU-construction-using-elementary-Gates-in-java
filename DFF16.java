
public class DFF16 {
	int[] out;

	
		
		public int[] dff16(int[] data, int clk) {
			DFF Dff = new DFF();
	        int[] out = new int[16];
	        for (int i=0; i<=15; i++) {
	        	out[i]=Dff.dff(data[i],clk);
	        }
	        return out;
		
	}
		/***public static void main(String[] args) {
			DFF16 Dff16 = new DFF16();
			int a[] = {1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1};
			int[] out = Dff16.dff16(a,0);
			for (int i=0;i<=15;i++) {
	    		   System.out.print(out[i]);
	    	   }
			
	}**/

}
