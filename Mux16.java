import java.util.Arrays;
public class Mux16 {
       int[] out,a,b;
       int sel;
       public int[] mux16(int[] a, int[] b, int sel) {
    	   int[] out = new int[16];
    	   if (sel==0) {
    		   out = a;}
    	   else {
    		   out = b;}
    	return out;   
       }
       
          /** public static void main(String[] args) {
    	   Mux16 obj =new Mux16();
    	   int a[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,0};
    	   int b[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1}; 
    	   int[] out = obj.mux16(a, b, 0);
    	   
    	   for (int i=0;i<=15;i++) {
    		   System.out.print(out[i]);
    	   }
    		   //System.out.print(Arrays.toString(out)));    
    	   }**/
    	   
       }

