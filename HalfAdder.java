
public class HalfAdder {
int a,b,sum,carry;

public int sum(int a, int b) {
	Xor XOR = new Xor();
	int out = XOR.xor(a,b);
	return out;
}
public int carry(int a, int b) {
	And AND = new And();
	int out = AND.and(a, b);
	return out;
	} 

/**public static void main(String[] args) {
	HalfAdder m = new HalfAdder();
	
	System.out.println(m.sum(1,1));
	System.out.println(m.carry(1,1));
}**/
}
