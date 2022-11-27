
public class JKFF {
 int qout;
 
    public int jkff(int j, int k, int clk) {
    
    Not NOT = new Not();
    Nand NAND = new Nand();
    DFF Dff = new DFF();
    
    int qout = 0;
    int nqout = NOT.not(qout);
    int ck = NOT.not(k);
    int c1 = NAND.nand(j, nqout);
    int c2 = NAND.nand(ck, qout);
    int c3 = NAND.nand(c1, c2);
    qout = Dff.dff(clk, c3);
    	
    
    return qout;
    
}
    /**public static void main(String[] args) {
		JKFF Jkff = new JKFF();
		int out = Jkff.jkff(1, 1, 0);
		System.out.println(out);
		
}   **/
}