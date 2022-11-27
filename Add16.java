import java.util.Arrays;
public class Add16 {
	int[] out;
	
	public int[] add16(int[] a, int[] b) {
		
		HalfAdder HALFADDER  = new HalfAdder();
		FullAdder FULLADDER = new FullAdder();
		
		int[] out = new int[16];
		
		out[15] = HALFADDER.sum(a[15],b[15]);
		int c = HALFADDER.carry(a[15],b[15]);
		
		out[14] = FULLADDER.sum(a[14],b[14],c);
		int d = FULLADDER.carry(a[14],b[14],c);
		
		out[13] = FULLADDER.sum(a[13],b[13],d);
		int e = FULLADDER.carry(a[13],b[13],d);
		
		out[12] = FULLADDER.sum(a[12],b[12],e);
		int f = FULLADDER.carry(a[12],b[12],e);
		
		out[11] = FULLADDER.sum(a[11],b[11],f);
		int g = FULLADDER.carry(a[11],b[11],f);
		
		out[10] = FULLADDER.sum(a[10],b[10],g);
		int h = FULLADDER.carry(a[10],b[10],g);
		
		out[9] = FULLADDER.sum(a[9],b[9],h);
		int i = FULLADDER.carry(a[9],b[9],h);
		
		out[8] = FULLADDER.sum(a[8],b[8],i);
		int j = FULLADDER.carry(a[8],b[8],i);
		
		out[7] = FULLADDER.sum(a[7],b[7],j);
		int k = FULLADDER.carry(a[7],b[7],j);
		
		out[6] = FULLADDER.sum(a[6],b[6],k);
		int l = FULLADDER.carry(a[6],b[6],k);
		
		out[5] = FULLADDER.sum(a[5],b[5],l);
		int m = FULLADDER.carry(a[5],b[5],l);
		
		out[4] = FULLADDER.sum(a[4],b[4],m);
		int n = FULLADDER.carry(a[4],b[4],m);
		
		out[3] = FULLADDER.sum(a[3],b[3],n);
		int o = FULLADDER.carry(a[3],b[3],n);
		
		out[2] = FULLADDER.sum(a[2],b[2],o);
		int p = FULLADDER.carry(a[2],b[2],o);
		
		out[1] = FULLADDER.sum(a[1],b[1],p);
		int q = FULLADDER.carry(a[1],b[1],p);
		
		out[0] = FULLADDER.sum(a[0],b[0],q);
		FULLADDER.carry(a[0],b[0],q);
		
		return out;
	}
	 /**public static void main(String[] args) {
		Add16 obj = new Add16();
		int a[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0};
 	    int b[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,1};
		int[] out = new int[16];
		out= obj.add16(a,b);
		System.out.print(Arrays.toString(out));
 		  
 	   
	}**/
	
	}
	
	



