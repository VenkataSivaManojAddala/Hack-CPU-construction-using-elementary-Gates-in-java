
public class Or3input {
int out;

      public int or3input(int a,int b,int c) {
    	  Or OR = new Or();
    	  int t1 = OR.or(a, b);
    	  int out = OR.or(t1, c);
    	  return out;
      }
}
