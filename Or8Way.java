	public class Or8Way {
	    int out;
		public int or8way(int [] in){
	        int a,b,c,d,e,f,out;
	        Or OR = new Or();
	        a = OR.or(in[0],in[1]);
	        b = OR.or(a,in[2]);
	        c = OR.or(b,in[3]);
	        d = OR.or(c,in[4]);
	        e = OR.or(d,in[5]);
	        f = OR.or(e,in[6]);
	        out = OR.or(f,in[7]);
	        
	       return out;
	        
	    }
		    /**public static void main(String[] args) {
			Or8Way obj = new Or8Way();
			int in[] = {0,1,0,1,0,1,0,1}; 
			int out = obj.or8way(in);
			System.out.print(out);
	 }**/
}


