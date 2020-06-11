package gates;

public class NAND extends AbstractGate{

int input1,input2,output;
	
	public NAND(int input1, int input2, int output){
		this.type=new String("NAND");
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		}
	
	public int operate(){
		return ((input1==1) && (input2==1) ? 0 : 1);
		}
	}