public class Sequence {
	int[] y;
	
	public int[] sequence (int[] x) {
		Not16 NOT16 = new Not16();
		And16 AND16 = new And16();
		DFF16 Dff16 = new DFF16();
		Or16 OR16 = new Or16();
		
		// int[] QB = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		// int[] QA = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int[] nx = NOT16.not16(x);
		int[] nQA = NOT16.not16(QA);
		int[] nQB = NOT16.not16(QB);
		
		int[] Atemp1 = AND16.and16(x, nQA);
		int[] AT1 = AND16.and16(Atemp1, QB);
		int[] Atemp2 = AND16.and16(x, QA);
		
		int[] BT1 = AND16.and16(QA,nQB);
		int[] AT2 = AND16.and16(Atemp2, nQB);
		
		int[] DB = OR16.or16(BT1,nx);
		int[] DA  = OR16.or16(AT1,AT2);
		
		int[] QA = Dff16.dff16(DA,1);
		int[] QB = Dff16.dff16(DB,1);
		
		int[] ytemp = AND16.and16(nx, QA);
		int[] y = AND16.and16(ytemp, QB);
		
		return y;
		
}
	    /**public static void main(String[] args) {
		Sequence SEQUENCE = new Sequence();
		int a[] = {0,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1}; 
		int[] y = SEQUENCE.sequence(a);
		 for (int i=0;i<=15;i++) {
  		   System.out.print(y[i]);}

}**/
}