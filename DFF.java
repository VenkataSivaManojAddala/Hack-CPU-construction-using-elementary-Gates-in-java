
public class DFF {
	
	public int dff(int data, int clk) {
	Nand NAND  = new Nand();
	Not NOT = new Not();
	clk = 1;
	int Sout = NAND.nand(data,clk);
	int Notout = NOT.not(data);
	
    int Rout = NAND.nand(clk, Notout);
    int Q = 0;
    int notQ = NAND.nand(Rout, Q);
    Q = NAND.nand(Sout, notQ);
    
    return Q;
	
}

	    /**public static void main(String[] args) {
		DFF Dff = new DFF();
		int out = Dff.dff(1, 0);
		System.out.println(out);
		
}**/
}


