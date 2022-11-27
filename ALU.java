import java.util.Arrays;

public class ALU {
	int[] out;   
	
	public static int[] alu(int zx, int nx, int zy, int ny,
	    int f, int no, int[] x, int[] y) {
	        
		    int[] fls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	        int[] tr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
            
	        
	        Mux16 MUX16 = new Mux16();
	        And16 AND16 = new And16();
	        Not16 NOT16 = new Not16();
	        Or8Way OR8WAY = new Or8Way();
	        Add16 ADD16 = new Add16();
	        Or OR = new Or();
	        Not NOT = new Not();
	        
	        int[] x1 = MUX16.mux16(x, fls, zx);
	        int[] y1 = MUX16.mux16(y, fls, zy);
	        
	        int[] notx1 = NOT16.not16(x1);
	        int[] x2 = MUX16.mux16(x1, notx1, nx);
	       
	        int[] noty1 = NOT16.not16(y1);
	        int[] y2 = MUX16.mux16(y1, noty1, ny);
	        
	        int[] addout = ADD16.add16(x2, y2);
	        int[] andout = AND16.and16(x2, y2);
   
	        int[] fout = MUX16.mux16(andout, addout, f);
	        
	        int[] notfout = NOT16.not16(fout);
	        
	        int[] out = MUX16.mux16(fout, notfout, no);
	        
	        
	        int[] outfirst = new int[8];
	        for (int i =8; i<=15;i++) {
	        	outfirst[i-8] = out[i];
	        }
	        
	        int[] outsecond = new int[8];
	        for (int i =0; i<=7;i++) {
	        	outsecond[i] = out[i];
	        }
	        int ng = out[15]; 

	        int zr0 = OR8WAY.or8way(outfirst);
	        int zr1 = OR8WAY.or8way(outsecond);
	        int zr2 = OR.or(zr0, zr1);
	        int zr = NOT.not(zr2);

	        return out;
	        
	   
	    }
	
	public static int zr(int zx, int nx, int zy, int ny,
		    int f, int no, int[] x, int[] y) {
		        
			    int[] fls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		        int[] tr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	            
		        
		        Mux16 MUX16 = new Mux16();
		        And16 AND16 = new And16();
		        Not16 NOT16 = new Not16();
		        Or8Way OR8WAY = new Or8Way();
		        Add16 ADD16 = new Add16();
		        Or OR = new Or();
		        Not NOT = new Not();
		        
		        int[] x1 = MUX16.mux16(x, fls, zx);
		        int[] y1 = MUX16.mux16(y, fls, zy);
		        
		        int[] notx1 = NOT16.not16(x1);
		        int[] x2 = MUX16.mux16(x1, notx1, nx);
		       
		        int[] noty1 = NOT16.not16(y1);
		        int[] y2 = MUX16.mux16(y1, noty1, ny);
		        
		        int[] addout = ADD16.add16(x2, y2);
		        int[] andout = AND16.and16(x2, y2);
	   
		        int[] fout = MUX16.mux16(andout, addout, f);
		        
		        int[] notfout = NOT16.not16(fout);
		        
		        int[] out = MUX16.mux16(fout, notfout, no);
		        
		        
		        int[] outfirst = new int[8];
		        for (int i =8; i<=15;i++) {
		        	outfirst[i-8] = out[i];
		        }
		        
		        int[] outsecond = new int[8];
		        for (int i =0; i<=7;i++) {
		        	outsecond[i] = out[i];
		        }
		        int ng = out[15]; 

		        int zr0 = OR8WAY.or8way(outfirst);
		        int zr1 = OR8WAY.or8way(outsecond);
		        int zr2 = OR.or(zr0, zr1);
		        int zr = NOT.not(zr2);

		        return zr;
		        
		   
		    }

	public static int ng(int zx, int nx, int zy, int ny,
		    int f, int no, int[] x, int[] y) {
		        
			    int[] fls = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		        int[] tr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	            
		        
		        Mux16 MUX16 = new Mux16();
		        And16 AND16 = new And16();
		        Not16 NOT16 = new Not16();
		        Or8Way OR8WAY = new Or8Way();
		        Add16 ADD16 = new Add16();
		        Or OR = new Or();
		        Not NOT = new Not();
		        
		        int[] x1 = MUX16.mux16(x, fls, zx);
		        int[] y1 = MUX16.mux16(y, fls, zy);
		        
		        int[] notx1 = NOT16.not16(x1);
		        int[] x2 = MUX16.mux16(x1, notx1, nx);
		       
		        int[] noty1 = NOT16.not16(y1);
		        int[] y2 = MUX16.mux16(y1, noty1, ny);
		        
		        int[] addout = ADD16.add16(x2, y2);
		        int[] andout = AND16.and16(x2, y2);
	   
		        int[] fout = MUX16.mux16(andout, addout, f);
		        
		        int[] notfout = NOT16.not16(fout);
		        
		        int[] out = MUX16.mux16(fout, notfout, no);
		        
		        
		        int[] outfirst = new int[8];
		        for (int i =8; i<=15;i++) {
		        	outfirst[i-8] = out[i];
		        }
		        
		        int[] outsecond = new int[8];
		        for (int i =0; i<=7;i++) {
		        	outsecond[i] = out[i];
		        }
		        int ng = out[15]; 

		        int zr0 = OR8WAY.or8way(outfirst);
		        int zr1 = OR8WAY.or8way(outsecond);
		        int zr2 = OR.or(zr0, zr1);
		        int zr = NOT.not(zr2);

		        return ng;
		        
		   
		    }
	
	
	    /**public static void main(String[] args) {	
		ALU Alu = new ALU();
		int[] x = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		int[] y = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		int[] out = Alu.alu(1, 1, 1, 1, 1, 1, x, y);
		for (int i=0;i<=15;i++) {
 		   System.out.print(out[i]);}
		  
	}**/
}



