package gates;

public class XOR extends AbstractGate{

int input1,input2,output;
	
	public XOR(int input1, int input2, int output){
		this.type=new String("XOR");
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		}
	
	public int operate(){
		return ((input1==input2) ? 0 : 1);
	}
}