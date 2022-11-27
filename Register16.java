
public class Register16 {
	int[] out;
	
	public int[] register16(int[] prevout, int[] in, int load) {
		Register REGISTER = new Register();
		int[] out = new int[16];
        for (int i=0; i<=15; i++) {
        	out[i]= REGISTER.register(prevout[i],in[i],load);}
        return out;
	}
}
