public class Register {
	

		public int register(int prevout,int a,int load) {
			Mux MUX = new Mux();	
			DFF Dff = new DFF();	
					int t;
			
        t = prevout;
		int stage1 = MUX.mux(t,a,load);
		t = Dff.dff(stage1,1);
		return t;
		}
		
		/**public static void main(String[] args) {
		Register BIT = new Register();
		int t = BIT.register(1,0,0);
		System.out.println(t);
		}**/
		}
		
		
    	   
       
    		   
    		   
    	
       
		




