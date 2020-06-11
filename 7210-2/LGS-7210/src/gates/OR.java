package gates;

public class OR extends AbstractGate{

int input1,input2,output;
	
	public OR(int input1, int input2, int output){
		this.type=new String("OR");
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		}
	
	public int operate(){
		return ((input1==0) && (input2==0) ? 0 : 1);
	}
}
