public class Mux {
       int out,nsel,c,d;
       public int mux(int a, int b, int sel) {
    	   Not NOT = new Not();
    	   And AND = new And();
    	   Or OR = new Or();
    	   
    	   nsel = NOT.not(sel);
    	   c = AND.and(a, nsel);
    	   d = AND.and(sel, b);
    	   out = OR.or(c, d);
    	   
    	  
    	  return(out); 
       }
       /**public static void main(String[] args) {
    	   Mux obj = new Mux();
    	   
    	   System.out.println(obj.mux(0,0,1));
       }**/
}

