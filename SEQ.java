public class SEQ {

	public int[] seq(int[] x) {
		
		int seq[] = {0,1,1,0};
		for(int i=0;i<=4;i++) {
			if (x[i] == 0) {
				if (x[i+1] == 1) {
					if (x[i+2] == 1) {
						if (x[i+3] == 0) {
							x[i] = 0;
							x[i+1] = 0;
							x[i+2] = 0;
							x[i+3] = 1;
							
							for(int j=0;j<=i-1;j++) {
								x[j] = 0;}
							for(int j=i+4;j<=7;j++) {
								x[j] = 0;}
						}
					}
				}
			}
		}
		return x;
	}
	        public static void main(String[] args) {
			SEQ Seq = new SEQ ();
			int a[] = {0,1,0,1,1,0,0,0};
			int[] out = Seq.seq(a);
			for (int i=0;i<=7;i++) {
	    		   System.out.print(out[i]);}
			}

}