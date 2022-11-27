import java.util.Arrays;

   public class And16 {
    int[] out;
	
    public int[] and16(int[] a, int[] b){
         
	     int[] out = new int[16];
         And AND = new And();
	        for (int i = 0; i < a.length; i++){
	            out[i] = AND.and(a[i], b[i]);
	        }
	        return out;
	        }

   /*** public static void main(String[] args) {
		And16 obj = new And16();
		int a[] = {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0};
 	    int b[] = {0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1}; 
		int[] out = new int[16];
		out= obj.and16(a,b);
		System.out.print(Arrays.toString(out));
 		  }**/
   }
   
   

