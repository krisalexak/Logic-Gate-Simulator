package logic;

public class Circuit {
	
	Breadboard myFinalBreadboard;
	Breadboard myBreadboard;

	public Circuit(Breadboard myFinalBreadboard,Breadboard myBreadboard){
		this.myFinalBreadboard=myFinalBreadboard;
		this.myBreadboard=myBreadboard;
		}
	
	
	public void runCircuit(){ 
		for(int i=1;i<Breadboard.columns;i++){
			for(int j=0;j<myBreadboard.numberOfGates;j++){
				if(myBreadboard.gates[j].stili==i){
						myFinalBreadboard.addGate(myBreadboard.gates[j].input1,myBreadboard.gates[j].input2,myBreadboard.gates[j].output,myBreadboard.gates[j].type,myBreadboard.gates[j].stili);
					}
				}
			}
		
		
		System.out.println("myFinalBreadboard");
		for (int i=0; i<8; i++){
			System.out.println();
			for (int j=0; j<Breadboard.columns; j++){
				System.out.print(myFinalBreadboard.pins[i][j] + " ");
			}
		}
		}
	

	
}
