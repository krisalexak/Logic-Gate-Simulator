package gates;

public class AND extends AbstractGate{

	int input1,input2,output;
	
	public AND(int input1, int input2, int output){
		this.type=new String("AND");
		this.input1 = input1;
		this.input2 = input2;
		this.output = output;
		
	}
	
	
	public int operate(){
		return ((input1==1) && (input2==1) ? 1 : 0);
	}

}
