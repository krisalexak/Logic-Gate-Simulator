package gates;

public class NOR extends AbstractGate{

int input1,input2,output;
	
	public NOR(int input1, int input2, int output){
		this.type=new String("NOR");
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		}
	
	public int operate(){
		return ((input1==0) && (input2==0) ? 1 : 0);
	}
}