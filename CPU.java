import java.util.Arrays;

public class CPU {
	
public int[] outM(int[] inM,int[] instruction,int reset) {
		
		Not16 NOT16 = new Not16();
		Mux16 MUX16 = new Mux16();
		Or OR = new Or();
		Not NOT = new Not();
		And AND = new And();
		Register16 AREGISTER16 = new Register16();
		Register16 DREGISTER16 = new Register16();
		ALU Alu = new ALU();
		PC Pc = new PC();
		
		int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int ni = NOT.not(instruction[0]);
		int[] i = MUX16.mux16(outtM, instruction, ni); 
		int intoA = OR.or(instruction[10], ni);
		int[] A = AREGISTER16.register16(prevout, i, intoA);
		int AorM = AND.and(instruction[15], instruction[12]);
		int[] AM = MUX16.mux16(A,inM,AorM);
		
		int intoD = AND.and(instruction[0],instruction[12]);
		int[] D = DREGISTER16.register16(prevout,outtM,intoD);
		
		int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
		
		int writeM = AND.and(instruction[0], instruction[12]);
		
		int pos  = NOT.not(ng);
		int nzr = NOT.not(zr);
		int jgt = AND.and(instruction[0], instruction[15]);
		int posnzr = AND.and(pos, jgt);
		int ld1 = AND.and(jgt, posnzr);
		
		int jeq = AND.and(instruction[0], instruction[14]);
		int ld2 = AND.and(jgt, zr);
		
		int jlt = AND.and(instruction[0], instruction[13]);
		int ld3 = AND.and(jlt, ng);
		
		int ldt = OR.or(ld1, ld2);
		int ld = OR.or(ld3, ldt);
		
		int[] out = Pc.pc(A, ld, 1, reset);
		
		int[] addressM = Arrays.copyOfRange(A,1,15);
		int[] pc = Arrays.copyOfRange(out, 1, 15);
		
		return outM;
		
		
	}
	
public int writeM(int[] inM,int[] instruction,int reset) {
		
		Not16 NOT16 = new Not16();
		Mux16 MUX16 = new Mux16();
		Or OR = new Or();
		Not NOT = new Not();
		And AND = new And();
		Register16 AREGISTER16 = new Register16();
		Register16 DREGISTER16 = new Register16();
		ALU Alu = new ALU();
		PC Pc = new PC();
		
		int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
		int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		int ni = NOT.not(instruction[0]);
		int[] i = MUX16.mux16(outtM, instruction, ni); 
		int intoA = OR.or(instruction[10], ni);
		int[] A = AREGISTER16.register16(prevout, i, intoA);
		int AorM = AND.and(instruction[15], instruction[12]);
		int[] AM = MUX16.mux16(A,inM,AorM);
		
		int intoD = AND.and(instruction[0],instruction[12]);
		int[] D = DREGISTER16.register16(prevout,outtM,intoD);
		
		int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
		int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
		
		int writeM = AND.and(instruction[0], instruction[12]);
		
		int pos  = NOT.not(ng);
		int nzr = NOT.not(zr);
		int jgt = AND.and(instruction[0], instruction[15]);
		int posnzr = AND.and(pos, jgt);
		int ld1 = AND.and(jgt, posnzr);
		
		int jeq = AND.and(instruction[0], instruction[14]);
		int ld2 = AND.and(jgt, zr);
		
		int jlt = AND.and(instruction[0], instruction[13]);
		int ld3 = AND.and(jlt, ng);
		
		int ldt = OR.or(ld1, ld2);
		int ld = OR.or(ld3, ldt);
		
		int[] out = Pc.pc(A, ld, 1, reset);
		
		int[] addressM = Arrays.copyOfRange(A,1,15);
		int[] pc = Arrays.copyOfRange(out, 1, 15);
		
		return writeM;
		
		
	}

public int[] addressM(int[] inM,int[] instruction,int reset) {
	
	Not16 NOT16 = new Not16();
	Mux16 MUX16 = new Mux16();
	Or OR = new Or();
	Not NOT = new Not();
	And AND = new And();
	Register16 AREGISTER16 = new Register16();
	Register16 DREGISTER16 = new Register16();
	ALU Alu = new ALU();
	PC Pc = new PC();
	
	int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
	int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	int ni = NOT.not(instruction[0]);
	int[] i = MUX16.mux16(outtM, instruction, ni); 
	int intoA = OR.or(instruction[10], ni);
	int[] A = AREGISTER16.register16(prevout, i, intoA);
	int AorM = AND.and(instruction[15], instruction[12]);
	int[] AM = MUX16.mux16(A,inM,AorM);
	
	int intoD = AND.and(instruction[0],instruction[12]);
	int[] D = DREGISTER16.register16(prevout,outtM,intoD);
	
	int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
	int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
	int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
	
	int writeM = AND.and(instruction[0], instruction[12]);
	
	int pos  = NOT.not(ng);
	int nzr = NOT.not(zr);
	int jgt = AND.and(instruction[0], instruction[15]);
	int posnzr = AND.and(pos, jgt);
	int ld1 = AND.and(jgt, posnzr);
	
	int jeq = AND.and(instruction[0], instruction[14]);
	int ld2 = AND.and(jgt, zr);
	
	int jlt = AND.and(instruction[0], instruction[13]);
	int ld3 = AND.and(jlt, ng);
	
	int ldt = OR.or(ld1, ld2);
	int ld = OR.or(ld3, ldt);
	
	int[] out = Pc.pc(A, ld, 1, reset);
	
	int[] addressM = Arrays.copyOfRange(A,1,16);
	int[] pc = Arrays.copyOfRange(out, 1, 16);
	
	return addressM;
	
	
}

public int[] pc(int[] inM,int[] instruction,int reset) {
	
	Not16 NOT16 = new Not16();
	Mux16 MUX16 = new Mux16();
	Or OR = new Or();
	Not NOT = new Not();
	And AND = new And();
	Register16 AREGISTER16 = new Register16();
	Register16 DREGISTER16 = new Register16();
	ALU Alu = new ALU();
	PC Pc = new PC();
	
	int outtM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; 
	int[] prevout = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	int ni = NOT.not(instruction[0]);
	int[] i = MUX16.mux16(outtM, instruction, ni); 
	int intoA = OR.or(instruction[10], ni);
	int[] A = AREGISTER16.register16(prevout, i, intoA);
	int AorM = AND.and(instruction[15], instruction[12]);
	int[] AM = MUX16.mux16(A,inM,AorM);
	
	int intoD = AND.and(instruction[0],instruction[12]);
	int[] D = DREGISTER16.register16(prevout,outtM,intoD);
	
	int[] outM = ALU.alu( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
	int zr = ALU.zr( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9], D, AM);
	int ng = ALU.ng( instruction[4], instruction[5],instruction[6], instruction[7], instruction[8],instruction[9],D, AM);
	
	int writeM = AND.and(instruction[0], instruction[12]);
	
	int pos  = NOT.not(ng);
	int nzr = NOT.not(zr);
	int jgt = AND.and(instruction[0], instruction[15]);
	int posnzr = AND.and(pos, jgt);
	int ld1 = AND.and(jgt, posnzr);
	
	int jeq = AND.and(instruction[0], instruction[14]);
	int ld2 = AND.and(jgt, zr);
	
	int jlt = AND.and(instruction[0], instruction[13]);
	int ld3 = AND.and(jlt, ng);
	
	int ldt = OR.or(ld1, ld2);
	int ld = OR.or(ld3, ldt);
	
	int[] out = Pc.pc(A, ld, 1, reset);
	
	int[] addressM = Arrays.copyOfRange(A,1,16);
	int[] pc = Arrays.copyOfRange(out, 1, 16);
	
	return pc;
	
	
}


public static void main(String[] args) {
CPU Cpu = new CPU();

int a[] = {0,0,1,1,0,0,0,0,0,0,1,1,1,0,0,1};
int inM[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

int[] outM = Cpu.outM(inM,a,0);
int writeM = Cpu.writeM(inM,a,0);
int[] addressM = Cpu.addressM(inM,a,0);
int[] pc = Cpu.pc(inM,a,0);

System.out.println("The value of outM is");

for (int i=0;i<=15;i++) {
	   System.out.print(outM[i]);}

System.out.println("\n"+"The value of writeM is");

System.out.println(writeM);

System.out.println("The value of addressM is");

for (int i=0;i<=14;i++) {
	   System.out.print(addressM[i]);}

System.out.println("\n"+"The value of pc is");

for (int i=0;i<=14;i++) {
	   System.out.print(pc[i]);}
}
}