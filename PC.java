
public class PC {
int[] FBout;
     
          public int[] pc(int[] in, int load, int inc, int reset) {
        	  
        	  int fl[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
        	  int prevout[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
        	  int FBout[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        	  
        	  Inc16 INC16 = new Inc16();
        	  Mux16 MUX16 = new Mux16();
        	  Or3input OR3INPUT = new Or3input();
        	  Register16 REGISTER16 = new Register16();
        	  
        	  int regload = OR3INPUT.or3input(inc, load, reset);
        	  int[] incout = INC16.inc16(FBout);
        	  int[] w0 = MUX16.mux16(FBout, incout, inc);
        	  int[] w1 = MUX16.mux16(w0, in, load);
        	  int[] cout = MUX16.mux16(w1, fl, reset);
              FBout = REGISTER16.register16(prevout,cout,regload);
              
              return FBout;
          
         }
          /**public static void main(String[] args) {
  			PC Pc = new PC();
  			int a[] = {1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1};
  			int[] out = Pc.pc(a,1,1,0);
  			for (int i=0;i<=15;i++) {
  	    		   System.out.print(out[i]);}
  			}**/
}
