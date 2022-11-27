
public class Inc16 {
int[] out;
 
           public int[] inc16(int[] a) {
        	   
        	   int tr[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        	   Add16 ADD16 = new Add16();
        	   int[] out = ADD16.add16(a, tr);
        	   return out;
           }


           /**public static void main(String[] args) {
            Inc16 INC16 = new Inc16();
       		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
            int[] out = INC16.inc16(a);
            for (int i=0;i<=15;i++) {
	    		   System.out.print(out[i]);}
}**/
}
