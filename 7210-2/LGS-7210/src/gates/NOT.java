package gates;

public class NOT extends AbstractGate{
	int input1,inut2,output;
	
	public NOT(int input1, int output){
		this.type=new String("NOT");
		this.input1 = input1;
		this.input2=0;
		this.output = output;
		}
	
	public int operate(){
		return (input1==1? 0:1);
		}
	}