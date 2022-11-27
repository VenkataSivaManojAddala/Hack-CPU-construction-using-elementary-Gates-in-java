public class Not {
   int out;
   public int not(int in) {
	   Nand NAND = new Nand();
	   out =  NAND.nand(in, in);
   return(out);
   }
	
}
