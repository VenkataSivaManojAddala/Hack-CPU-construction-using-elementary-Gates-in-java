
public class Or16 {
	
		int[] out; 
		
		public int[] or16(int[] a, int[] b){
	        Or OR = new Or();
	        int[] out = new int[16];
	        for (int i=0; i<=15; i++) {
	        	out[i]= OR.or(a[i],b[i]);
	        }
	        return out;

}
}
